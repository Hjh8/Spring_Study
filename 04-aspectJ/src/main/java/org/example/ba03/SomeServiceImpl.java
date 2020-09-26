package org.example.ba03;

public class SomeServiceImpl implements SomeService {

    @Override
    public void doAround() {
        System.out.println("执行了doAround方法");
    }
}
