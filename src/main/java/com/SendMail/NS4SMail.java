package com.SendMail;

import java.util.Calendar;
import java.util.Properties;
import java.util.TimerTask;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class NS4SMail extends TimerTask {
	String filename=null;
public NS4SMail(String string) {
		this.filename=string;
	}
	@Override
	public void run() {
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE)+ ":" + now.get(Calendar.SECOND));
		
		
		  Properties props = new Properties();
	      props.put("mail.smtp.host", "mail.vikas.lk");
	      props.put("mail.smtp.socketFactory.port", "25");
	      props.put("mail.smtp.socketFactory.class",
	              "javax.net.ssl.SSLSocketFactory");
	      props.put("mail.smtp.auth", "true");
	      props.put("mail.smtp.port", "25");

	      Session session = Session.getDefaultInstance(props,
	          new javax.mail.Authenticator() {
	              protected PasswordAuthentication getPasswordAuthentication() {
	                  return new PasswordAuthentication("qaauto@vikas.lk","Qaauto123");
	              }
	          });

	      try {
	    	  
	    	  InternetAddress[] email = InternetAddress.parse("joan.salas@qigroup.com,benjamin.mirando@qigroup.com,lia.dulay@qigroup.com,hattaiwat.p@qnet.net,ITApps.servicedesk@qigroup.com,peter.kwan@qnet.net,dano.dometita@qnet.net,osura.liyanage@qnet.net,pavithri.fernando@qnet.net,automated.testing@qnet.net");
	            MimeMessage message = new MimeMessage(session);

	            // Set From: header field of the header.
	            message.setFrom(new InternetAddress("qaauto@vikas.lk"));

	            // Set To: header field of the header.
	            message.addRecipients(Message.RecipientType.TO,email);

	            // Set Subject: header field
	            message.setSubject("NS4S Performance Report-Production");

	            // Create the message part 
	            BodyPart messageBodyPart = new MimeBodyPart();

	            // Fill the message
	            messageBodyPart.setText("Please find the attachment under attachments tab.\n"+"Please Note this is an auto generated E mail.\n"+"Thanks\n"+"Jenkins");
	          
	            
	            // Create a multipar message
	            Multipart multipart = new MimeMultipart();

	            // Set text message part
	            multipart.addBodyPart(messageBodyPart);

	            // Part two is attachment
	            messageBodyPart = new MimeBodyPart();
	           
	            DataSource source = new FileDataSource("src/test/resources/NS4S/"+filename);
	            messageBodyPart.setDataHandler(new DataHandler(source));
	            messageBodyPart.setFileName(filename);
	            multipart.addBodyPart(messageBodyPart);

	            // Send the complete message parts
	            message.setContent(multipart );

	            // Send message
	            Transport.send(message);
	            System.out.println("Sent message successfully....");
	    
	  
	        } catch (MessagingException e) {
	            throw new RuntimeException(e);
	        }
		
	}

}
