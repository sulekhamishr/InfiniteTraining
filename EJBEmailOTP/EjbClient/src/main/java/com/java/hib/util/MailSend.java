package com.java.hib.util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

//Utility class to send emails using Gmail SMTP server
public class MailSend {
	
	//we are taking here return type as String because we are taking parameters as String 
	public static String sendInfo(String toEmail, String subject, String data) {
		
		//Sender's Email Id
        String from = "prasanna.trainer@gmail.com";
        
        //Assuming you are sending email through gmail smtp
        // gmail smtp refers to simple mail transfer protocol - server provided by Google 's gmail services
        //it allows you to send mail by third party provider(like outlook or gmail)
        //stmp server adddress for gmail
        String host="smtp.gmail.com";
        
        
        //Get System properties
        //In java properties is a class used to store in key/pair mostly used for configuration settings.
        //You can use a Map<String, String> if you're building your own wrapper, but JavaMail still requires a Properties object in the end.
        //System.getProperties is a method in java.lang.system class that returns the current system propeties, java environment.
        //It's usually better to use new Properties() when you're only setting email configurations to avoid touching unrelated system properties.
        //👉 Alternative: You can replace System.getProperties() with new Properties() for better practice.
        Properties properties= System.getProperties();
        properties.put("mail.smtp.host",host); //specifies smtp server address (smtp.gmail.com) (host, properties)
        properties.put("mail.smtp.port","465"); //sets the port for SSL smtp (465 is commonly used for secure connection).
        properties.put("mail.smtp.ssl.enable","true"); //enables secure socket layer(ssl) for encryption
        properties.put("mail.smtp.auth","true"); //smpt authentication means username , password
        
        // Create a mail session with authentication
        //getInstance of session object
        // javax.mail.authenticator - it's an annonymous inner class without any name  which is used to create instance of object ,
        //that overrides the method getPasswordAuthentication , it's job is to provide email , password when smtp ask for authentication
        Session session= Session.getInstance(properties,new javax.mail.Authenticator() {
        	
        	//password authentication is a class in javax.mail.PasswordAuthentication that holds  Username , password
        	protected PasswordAuthentication getPasswordAuthentication() {
        		                                                    //(email,app password)
        		return new PasswordAuthentication("prasanna.vsp80@gmail.com","soqdhechjkcchkgl");
        	}
        });
        
        //used to debug smtp issues
        session.setDebug(true);
        
        try {
        	//MIME = Multipurpose Internet Mail Extensions
        	//mime message is a class in java mail api which is used  craete and send email mesaages
            //Creates a new email message object, using the authenticated session , you set up earlier
            MimeMessage message = new MimeMessage(session);
        	
        	//Sets the sender's email address.
            message.setFrom(new InternetAddress(from));
        	
        	//Adds the receiver's email address to the message.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
        	
        	//Sets the subject line of the email.
        	message.setSubject(subject);
        	
        	//Sets the body of the email — the actual message content.
        	message.setText(data);
        	
        	//Prints a debug message to the console.
        	System.out.println("sending...");
        	
        	//Send a message
        	Transport.send(message);
        	System.out.println("Send message successfully");
        	return "mail send successfully";
        }catch(MessagingException mex) {
        	mex.printStackTrace(); //information abut the error
        	return mex.getMessage(); // short error message , we
        }
		
	}

}




/** why are we using app password for real gmail password ?
 * google block less secure apps (like email clients or java mail) from using your real gmail passord to protect your account
 * so we must use 16 digit app password created by google.
 * 
 */
