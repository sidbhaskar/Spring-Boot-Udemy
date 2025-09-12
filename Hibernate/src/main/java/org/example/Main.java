package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(3);
        s1.setsName("harsh");
        s1.setsAge(23);

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();

        // for update
//        Transaction transaction = session.beginTransaction();
//        session.merge(s1);
//        transaction.commit();

        // for fetching
//        Student s2 = session.find(Student.class, 1);

        // for saving in db
//        Transaction transaction = session.beginTransaction();
//        session.persist(s1);
//        transaction.commit();

        session.close();
        sessionFactory.close();

        System.out.println(s1);
    }
}