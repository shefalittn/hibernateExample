package com.hibernate.demo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;



public class Application2 {
    public static void main(String[] args) throws ParseException {
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        SimpleDateFormat dateformatter = new SimpleDateFormat("yyyy-mm-dd"); //date

        Author author1 = new Author();             //create
        author1.setfirstname("Shefali");
        author1.setlastname("Srivastava");
        author1.setage(22);
        author1.setid(1);
        author1.setdate(dateformatter.parse("1997-01-20"));
        session.save(author1);
        //session.getTransaction().commit();


        Author author2 = new Author();
        author2.setfirstname("parul");
        author2.setlastname("rawal");
        author2.setage(22);
        author2.setid(22);
        author2.setdate(dateformatter.parse("1998-01-22"));
        session.save(author2);
        //session.getTransaction().commit();


        Author author3= new Author();
        author3.setfirstname("abc");
        author3.setlastname("singh");
        author3.setage(22);
        author3.setid(33);
        author3.setdate(dateformatter.parse("1999-01-20"));
        session.save(author3);
        //session.getTransaction().commit();


        Author author4= new Author();
        author4.setfirstname("anchal");
        author4.setlastname("singh");
        author4.setage(22);
        author4.setid(44);
        author4.setdate(dateformatter.parse("2000-01-20"));
        session.save(author4);
        //session.getTransaction().commit();

        session.beginTransaction();
        Author author=session.get(Author.class,1);  //read
        author.setfirstname("Shivani"); //update
        session.update(author);
        session.delete(author);                           //delete
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
        System.out.println(author);
        System.out.println("hello world");


    }
}

