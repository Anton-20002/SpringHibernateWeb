package com.test;

import com.test.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import java.util.HashMap;

/**
 * Created by Anton on 13.10.2018.
 */
public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setUserName("Semen");
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        EntityManagerFactory factory = (EntityManagerFactory) context.getBean("entityManager");
        EntityManager entity = factory.createEntityManager();
        entity.getTransaction().begin();
        System.out.println("Start transaction");
        entity.persist(user);
        entity.getTransaction().commit();
        entity.close();
        factory.close();
    }
}
