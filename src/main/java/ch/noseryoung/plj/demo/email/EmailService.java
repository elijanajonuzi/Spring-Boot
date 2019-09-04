package ch.noseryoung.plj.demo.email;

import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{
	
	public JavaMailSender javaMailSender;
	
	@Autowired
	public EmailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	@Override
	public void sendContent(Email email) {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		
		try {
		MimeMessageHelper mimeMessageHelper =new MimeMessageHelper(mimeMessage, true);
		
	
        mimeMessageHelper.setTo(email.getTo()); 
        mimeMessageHelper.setSubject(email.getSubject()); 
        mimeMessageHelper.setText(email.getText());
        
        
        
        
        for (String attachment: email.getAttachments()) {
            File file = new File(attachment);
            mimeMessageHelper.addAttachment(file.getName(), file);
        }
        
        javaMailSender.send(mimeMessageHelper.getMimeMessage());
		}catch(MessagingException e) {
			e.printStackTrace();
		}
		
		
	}
}
