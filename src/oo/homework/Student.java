package oo.homework;

/*

- Student类：name，age，className，stuId，构造方法()，study()，sayHi()，playWith(String anotherName)
- StudentTest类：创建对象，访问测试
 */
public class Student {
    String name;
    int age;
    String className;
    String stuId;

    Student() {
    }

    Student(String name, int age, String className, String stuId) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.stuId = stuId;
    }

    void study() {
        System.out.println(name + " is Learning");
    }

    void sayHi() {
        System.out.println("hello,everyone,my name is " + name + " im " + age + " years old" + " my class is " + className + " my Id is " + stuId);
    }

    void playWith(String anotherName) {
        System.out.println(name + " play with " + anotherName);
    }
}
