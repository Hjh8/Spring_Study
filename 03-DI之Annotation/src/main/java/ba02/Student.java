package ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
    /*
    * @Value 简单类型赋值
    *   属性：Value是String类型，简单类型的属性值
    *   位置：
    *       1. 在属性定义的上面，无需set方法。（推荐）
    *       2. 在set方法的上面
    * */
    @Value("codeKiang")
    private String name;
    @Value("28")
    private int age;

//    public void setName(String name) {
//        System.out.println("调用了setName");
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        System.out.println("调用了setAge");
//        this.age = age;
//    }

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
