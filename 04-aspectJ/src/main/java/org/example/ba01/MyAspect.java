package org.example.ba01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

// 声明当前类为切面类
@Aspect
public class MyAspect {
    @Before(value = "execution(public void doSome(..))")
    public void myBefore(){
        System.out.println("你在"+ new Date() + "的时候喝了一杯奶茶！");
    }
}
