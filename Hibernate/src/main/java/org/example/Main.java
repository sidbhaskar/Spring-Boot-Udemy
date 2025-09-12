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

        Laptop laptop = session.getReference(Laptop.class,2);

        session.close();

        sessionFactory.close();

    }
}