package org.example.ba01;

public class Student {
    private String name;
    private int age;

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
                '}';
    }
}
