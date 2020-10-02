package org.example;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        String config = "spring-config.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String[] names = ac.getBeanDefinitionNames();
        for (String na:names){
            System.out.println(na);
        }
    }

    @Test
    public void test01()
    {
        String config = "spring-config.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 获取到service对象
        StudentService std = (StudentService) ac.getBean("studentService");
        List<Student> students = std.QueryAllStudent();
        students.forEach(x -> System.out.println(x));
    }

    @Test
    public void test02()
    {
        String config = "spring-config.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService std = (StudentService) ac.getBean("studentService");
        Student s = new Student(20182102, "芋泥波波", "yuni@qq.com", 26);
        std.InsertStudent(s);
    }
}
