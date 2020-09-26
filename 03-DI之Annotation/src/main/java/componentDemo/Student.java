package componentDemo;

import org.springframework.stereotype.Component;

/*
* @Component 创建对象，等同于<bean>标签的功能。位置要处于类的上面
*   属性：value 对象的名称
* */
//@Component(value = "myStudent")
@Component("myStudent")
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
