/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recreat.util;

import com.recreat.dto.EmailDTO;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

/**
 *
 * @author jaquise
 */
public class EmailUtils {

    public static void send(JavaMailSender mailSender, final EmailDTO mailDto) {
        MimeMessagePreparator preparator = new MimeMessagePreparator() {
            @Override
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
                
                if(mailDto.getTo() != null){
                    message.setTo(mailDto.getTo());
                }
                if(mailDto.getListTo() != null){
                    for(String to : mailDto.getListTo()){
                        message.addTo(to);
                    }
                }
                
                if(mailDto.getCc() != null){
                    message.setCc(mailDto.getCc());
                }
                if(mailDto.getListCc() != null){
                    for(String cc : mailDto.getListCc()){
                        message.addCc(cc);
                    }
                }
                
                message.setSubject(mailDto.getSubject());
                message.setText(mailDto.getText(), true);
            }
        };
        mailSender.send(preparator);
    }
}
