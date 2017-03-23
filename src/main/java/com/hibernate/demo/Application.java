package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {

    public static void main(String[] args) {

        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setName("Emp 1");
        session.save(employee1);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setName("Emp 2");
        session.save(employee2);

        Employee employee3 = new Employee();
        employee3.setId(3);
        employee3.setName("Emp 3");
        session.save(employee3);

        Employee employee4 = new Employee();
        employee4.setId(4);
        employee4.setName("Emp 4");
        session.save(employee4);

        Employee employee5 = new Employee();
        employee5.setId(5);
        employee5.setName("Emp 5");
        session.save(employee5);

        Employee employee6 = new Employee();
        employee6.setId(6);
        employee6.setName("Emp 6");
        session.save(employee6);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("Hello World 1234 !!!!");
    }
}
