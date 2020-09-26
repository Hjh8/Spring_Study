package org.example;

import static org.junit.Assert.assertTrue;

import org.example.service.Demo;
import org.example.service.Impl.DemoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue()
    {
        // 手动创建对象
//        DemoImpl d = new DemoImpl();
//        d.example();

        // spring自动创建对象
        // 1.指定spring配置文件的名称
        String config = "beans.xml";
        // 2.创建表示spring容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 3.从容器中获取对象
        DemoImpl d = (DemoImpl) ac.getBean("demo");
        // 4.使用对象
        d.example();
    }
    @Test
    public void GetTest(){
        // 1.指定spring配置文件的名称
        String config = "beans.xml";
        // 2.创建表示spring容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 使用spring提供的方法
        // 获取容器中定义对象的数量
        int num = ac.getBeanDefinitionCount();
        System.out.println("容器中创建了"+ num +"个对象");
        // 获取容器中每个定义对象的名称
        String[] name = ac.getBeanDefinitionNames();
        System.out.println(Arrays.toString(name));
    }
}
