package org.example;

import static org.junit.Assert.assertTrue;
import ba04.Student;
//import componentDemo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest
{

    @Test
    public void test01()
    {
        String config = "componentDemo/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu = (Student) ac.getBean("myStudent");
        System.out.println(stu);
    }
    @Test
    public void test02()
    {
        String config = "componentDemo/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu = (Student) ac.getBean("myStudent");
        System.out.println(stu);
    }
    @Test
    public void test03()
    {
        String config = "componentDemo/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu = (Student) ac.getBean("myStudent");
        System.out.println(stu);
    }
    @Test
    public void test04()
    {
        String config = "componentDemo/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student stu = (Student) ac.getBean("myStudent");
        System.out.println(stu);
    }
}
