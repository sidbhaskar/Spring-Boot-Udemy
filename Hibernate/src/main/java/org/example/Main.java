package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {



        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        String brand = "Asus";

        Query query = session.createQuery("select brand, model from Laptop where brand like ?1 ");
        query.setParameter(1,brand);
        List<Object[]> laptops = query.getResultList();

//        Laptop l1 = session.find(Laptop.class,3);

        System.out.println(laptops);

        session.close();

        sessionFactory.close();

    }
}