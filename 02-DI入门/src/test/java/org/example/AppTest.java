package org.example;

import org.example.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class AppTest 
{

    @Test
    public void test01()
    {
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student s = (Student)ac.getBean("myStudent");
        System.out.println(s);
        System.out.println("=========以下为非自定义类的调用======");
        Date date = (Date) ac.getBean("myDate");
        System.out.println(date);
    }
    @Test
    public void test02()
    {
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student s = (Student)ac.getBean("myStudent");
        System.out.println(s);
    }
    @Test
    public void test03()
    {
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student s = (Student)ac.getBean("myStudent");
        System.out.println(s);
    }
    @Test
    public void test04()
    {
        String config = "ba04/Total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student s = (Student)ac.getBean("myStudent");
        System.out.println(s);
    }
}
