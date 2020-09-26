package org.example;

import org.example.ba03.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{

    @Test
    public void ba01()
    {
        String config = "applicationConfig.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService ss = (SomeService) ac.getBean("someService");
//        ss.doSome();
    }

    @Test
    public void ba02()
    {
        String config = "applicationConfig.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService ss = (SomeService) ac.getBean("someService");
//        ss.doSubmit();
    }

    @Test
    public void ba02_1()
    {
        String config = "applicationConfig.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService ss = (SomeService) ac.getBean("someService");
//        System.out.println("测试类中的返回值：" + ss.doSubmit2());
    }

    @Test
    public void ba03()
    {
        String config = "applicationConfig.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService ss = (SomeService) ac.getBean("someService");
        ss.doAround();
    }
}
