package org.example.ba02;

public class SomeServiceImpl implements SomeService {

    @Override
    public void doSome() {
        System.out.println("喝奶茶了!");
    }

    @Override
    public String doSubmit() {
        System.out.println("事务提交成功！");
        return "submit";
    }

    @Override
    public Student doSubmit2() {
        System.out.println("事务提交成功！");
        Student stu = new Student("codekiang", "201810089");
        return stu;
    }
}
