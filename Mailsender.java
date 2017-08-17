/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.*;
public class Mailsender {
public static void sendMail(String password, String email) {

		Properties props=new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port","465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		Session session=Session.getDefaultInstance(props, new Authenticator()
		{
            @Override
			protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
				return new javax.mail.PasswordAuthentication("unknownid28@gmail.com", "massazeesa");
			}
		});
		try{
			// multiple senders
			//String to[]={"dharani081990@gmail.com","dharani@uniqtechnologies.co.in"};
		String sender=email;
                    /*InternetAddress[] addressTo=new InternetAddress[to.length];
			for(int i=0;i<to.length;i++)
			{
				addressTo[i]=new InternetAddress(to[i]);
			}*/
			MimeMessage msg=new MimeMessage(session);
			msg.setFrom(new InternetAddress("unknownid28@gmail.com"));
			msg.addRecipients(Message.RecipientType.TO, sender);
			
			msg.setSubject("PASSWORD FROM BANK");
                       // String pass=password;
			msg.setText("This is your password : "+password);
			
			Transport.send(msg);
			System.out.println("Mail sent successfully");
			
		}
		catch(Exception e)
		{
			
		}
	}


}
