/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.service;

import com.mongodb.BasicDBObject;
import com.recreat.crypto.Crypto;
import com.recreat.dto.EmailDTO;
import com.recreat.type.UsuarioType;
import com.recreat.util.Collections;
import com.recreat.util.EmailUtils;
import com.recreat.util.MapUtils;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author jaquise
 */
@Service
@Repository
public class UsuarioService {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private JavaMailSender mailSender;

    public List<UsuarioType> listar(UsuarioType usuario) throws Exception {

        Query query = MapUtils.processQueryBean(usuario, "usuarioId");
        return mongoTemplate.find(query, UsuarioType.class, Collections.TB_USUARIO);
    }

    public String insertar(UsuarioType usuario) throws Exception {
        if (!mongoTemplate.collectionExists(Collections.TB_USUARIO)) {
            mongoTemplate.createCollection(Collections.TB_USUARIO);
        }

        if (usuario.getContrasenha() != null) {
            usuario.setContrasenha(Crypto.getInstance().doEncrypt(usuario.getContrasenha()));
        }
        mongoTemplate.insert(usuario, Collections.TB_USUARIO);
        return usuario.getUsuarioId();
    }

    public void actualizar(UsuarioType usuario) throws Exception {

        if (usuario.getContrasenha() != null) {
            usuario.setContrasenha(Crypto.getInstance().doEncrypt(usuario.getContrasenha()));
        }

        BasicDBObject newDocument = MapUtils.processBasicDBObject(usuario);
        newDocument.removeField("usuarioId");

        ObjectId id = new ObjectId(usuario.getUsuarioId());
        Query query = query(where("_id").is(id));
        Update update = Update.fromDBObject(newDocument);

        mongoTemplate.updateFirst(query, update, Collections.TB_USUARIO);
    }

    public void eliminar(String usuarioId) throws Exception {
        ObjectId id = new ObjectId(usuarioId);
        Query query = query(where("_id").is(id));
        mongoTemplate.remove(query, Collections.TB_USUARIO);
    }

    public UsuarioType logearUsuario(String usuario, String contrasenha) throws Exception {
        contrasenha = Crypto.getInstance().doEncrypt(contrasenha);
        Query query = query(where("usuario").is(usuario).and("contrasenha").is(contrasenha));
        return mongoTemplate.findOne(query, UsuarioType.class, Collections.TB_USUARIO);
    }

    public Boolean verificarUsuario(String usuario) throws Exception {
        Query query = query(where("usuario").is(usuario));
        long result = mongoTemplate.count(query, Collections.TB_USUARIO);

        return result == 0 ? true : false;
    }

    public void sendConfirmEmail(final UsuarioType usuario) {
        EmailDTO email = new EmailDTO();

        String to = usuario.getCorreo();
        String subject = "[l8kstreet] Verifique por favor su email '" + usuario.getCorreo() + "'";
        String url = String.format("http://192.168.5.141:8084/l8k-web/services/login/confirm_verification/%s/%s", usuario.getUsuario(), usuario.getUsuarioId());
        String text = "<html>"
                + "         <body>"
                + "             <h3>Bienvenido a l8kstreet.</h3>"
                + "             <p>Este correo electrónico se ha enviado de forma automática para confirmar la identidad del usuario que ha solicitado el registro en l8kstreet.</p>"
                + "             <p>Para continuar con el registro y activar su cuenta en l8kstreet, pulsa el siguiente enlace para proceder con la confirmación.</p>"
                + "             <p><a target='_blank' href='" + url + "'>" + url + "</a></p>"
                + "             <p><small>(Si no es " + usuario.getUsuario() + " o no solicitó el registro en l8kstreet, por favor elimine este mensaje.)</small></p>"
                + "         </body>"
                + "    </html>";

        email.setTo(to);
        email.setSubject(subject);
        email.setText(text);

        EmailUtils.send(mailSender, email);
    }
}
