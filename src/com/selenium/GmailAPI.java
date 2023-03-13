package com.selenium;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Properties;
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
import javax.mail.internet.*;

public class GmailAPI {
    public static void main(String[] args) {

        String[] multi_addresses = {"ninny21051992@gmail.com", "arielxtx@hotmail.com"};
        String toCc = "ninny21051992@gmail.com";
        String mailFrom = "ninny21051992@gmail.com";
        String subject = "Sent by API";
        String BodyText = "This mail is sent by API";
        String userName = "ninny21051992@gmail.com";
        String password = "aisxejvaxeiulrtw";
        String file_path = "D:\\file.txt";

        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mailFrom));
            InternetAddress[] addressTo = new InternetAddress[multi_addresses.length];
            for (int i = 0; i < multi_addresses.length; i++)
            {
                message.addRecipient(Message.RecipientType.TO,new
                        InternetAddress(multi_addresses[i]));
            }
            message.addRecipient(Message.RecipientType.CC, new InternetAddress(toCc));
            message.setSubject(subject);
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(BodyText);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(file_path);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(file_path);
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);
            System.out.println("message sent successfully");

        } catch (MessagingException e) {
            System.err.println("message sent fails");
            throw new RuntimeException(e);
        }
    }

}

