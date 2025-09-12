package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Asus");
        l1.setModel("vivobook");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("apple");
        l2.setModel("macbook");
        l2.setRam(12);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("dell");
        l3.setModel("xps");
        l3.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Sid");
        a1.setTech("java");

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("harsh");
        a2.setTech("python");

        a1.setLaptops(Arrays.asList(l1, l2));
        a2.setLaptops(Arrays.asList(l3));


        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);

        transaction.commit();


        session.close();

        Session session1 = sessionFactory.openSession();
        Alien a5 = session1.find(Alien.class, 101);
//        System.out.println(a5);
        session.close();


        sessionFactory.close();

    }
}