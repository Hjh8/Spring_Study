package org.example.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import java.util.Date;

// 声明当前类为切面类
@Aspect
public class MyAspect {
    @Before(value = "execution(public void doSome(..))")
    public void myBefore(JoinPoint jc){
        System.out.println("你在"+ new Date() + "的时候喝了一杯奶茶！");
    }

    @AfterReturning(value = "execution(* *..ba02.*.doSubmit(..))", returning = "res")
    public void myAfterReturning(JoinPoint jc, Object res){
        System.out.println(new Date() + "进行了事务提交");
        System.out.println("doSubmit的返回值是："+res);
    }

    @AfterReturning(value = "execution(* *..ba02.*.doSubmit2(..))", returning = "res")
    public void myAfterReturning2(Student res){
        System.out.println(new Date() + "进行了事务提交");
//        res = new Student("hang", "20202323");
        res.setId("20202323");
        res.setName("hang");
        System.out.println("myAfterReturning2中的返回值是："+res);
    }
}

