package org.example.ba02;

public class Student {
    private String name;
    private int age;
    // 引用类型
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setName(String name) {
        System.out.println("调用了setName");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("调用了setAge");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
