package com.test;

import com.test.entity.User;
import com.test.service.TestData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Anton on 15.08.2018.
 */
public class App {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("Artem");
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        SessionFactory factory = (SessionFactory) context.getBean("sessionFactory");
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        factory.close();

        TestData testData = new TestData();
        testData.makeCoffee("Java");


    }
}
