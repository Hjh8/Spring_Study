package org.example.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import java.util.Date;

@Aspect
public class MyAspect {
    @Around(value = "mypt()")  // 一定要加上括号！！
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object result = null;
        System.out.println("在执行doAround前打印时间："+new Date());
        // 执行目标方法
        pjp.proceed(); // 等价于Method.invoke();
        System.out.println("在执行doAround后提交事务");

        // 有返回值的切面方法都要return
        return result;
    }

    @Around(value = "mypt()")  // 一定要加上括号！！
    public Object myAround2(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("测试类");
        return null;
    }

    @Pointcut(value = "execution(* *..ba03.*.doAround(..))")
    private void mypt(){
        // 作为别名的函数，不需要代码，修饰符为private
    }
}

