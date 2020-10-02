package org.example.controller;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        int age = Integer.parseInt(request.getParameter("age"));
        // 创建spring的容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        // 框架创建容器对象
        WebApplicationContext ac = null;
        ServletContext sc = getServletContext();
        ac = WebApplicationContextUtils.getWebApplicationContext(sc);

        System.out.println("容器对象信息是========="+ac);

        //容器对象信息是=========org.springframework.context.support.ClassPathXmlApplicationContext@38f28551, started on Fri Oct 02 19:21:42 CST 2020

        // 获取service
        StudentService studentService = (StudentService) ac.getBean("studentService");
        Student stu = new Student(id, name, email, age);
        studentService.InsertStudent(stu);
        //页面跳转
        request.getRequestDispatcher("/show.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
