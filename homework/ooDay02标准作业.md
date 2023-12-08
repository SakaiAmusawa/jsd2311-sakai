# 面向对象第二天标准作业：

## 列表：

1. Person、Student、Teacher、Doctor类和Test类

   - Person类：name、age、address、Person(参)、eat()、sleep()，sayHi()
   - Student类：继承Person、className、stuId，Student(参)、study()，重写sayHi()方法
   - Teacher类：继承Person、salary，Teacher(参)、teach()，重写sayHi()方法
   - Doctor类：继承Person、title，Doctor(参)、cut()
   - Test：创建对象、调用方法测试

2. Animal、Dog、Chick、Fish和AnimalTest类

      - Animal类：name、age、color、Animal(参)、drink()、eat()
   - Dog类：继承Animal，重写eat()、lookHome()
   - Chick类：继承Animal，重写eat()、layEggs()
   - Fish类：继承Animal，重写eat()
   - AnimalTest：创建3个Dog对象、3个Chick对象、2个Fish对象，并测试

   

## 参考：

1. Person、Student、Teacher、Doctor类和Test类

      - Person类：name、age、address、Person(参)、eat()、sleep()，sayHi()

      - Student类：继承Person、className、stuId，Student(参)、study()，重写sayHi()方法

      - Teacher类：继承Person、salary，Teacher(参)、teach()，重写sayHi()方法

      - Doctor类：继承Person、title，Doctor(参)、cut()

      - Test：创建对象、调用方法测试

        ```java
        package ooday02;
        /**
         * 人类
         */
        public class Person {
            String name;
            int age;
            String address;
            Person(){
            }
            Person(String name,int age,String address){
                this.name = name;
                this.age = age;
                this.address = address;
            }
            void eat(){
                System.out.println(name+"正在吃饭...");
            }
            void sleep(){
                System.out.println(name+"正在睡觉...");
            }
            void sayHi(){
                System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，家住"+address);
            }
        }
        
        package ooday02;
        /**
         * 学生类---继承了Person
         */
        public class Student extends Person {
            String className; //new Student("zhangsan",25,"LF","jsd2303","001");
            String stuId;
            Student(){
            }
            Student(String name,int age,String address,String className,String stuId){
                super(name,age,address); //传递的是name/age/address的具体的值
                this.className = className;
                this.stuId = stuId;
            }
            void study(){
                System.out.println(name+"正在学习...");
            }
        
            void sayHi(){
                System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，家住"+address+"，所在班级为:"+className+"，学号为:"+stuId);
            }
        }
        
        package ooday02;
        /**
         * 老师类---继承了Person
         */
        public class Teacher extends Person {
            double salary;
            Teacher(){
            }
            Teacher(String name,int age,String address,double salary){
                super(name,age,address);
                this.salary = salary;
            }
            void teach(){
                System.out.println(name+"正在讲课...");
            }
            void sayHi(){
                System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，家住"+address+"，工资为:"+salary);
            }
        }
        
        package ooday02;
        /**
         * 医生类---继承了Person
         */
        public class Doctor extends Person {
            String title;
            Doctor(){
            }
            Doctor(String name,int age,String address,String title){
                super(name,age,address);
                this.title = title;
            }
            void cut(){
                System.out.println(name+"正在做手术...");
            }
        }
        
        package ooday02;
        /**
         * 测试类
         */
        public class Test {
            public static void main(String[] args) {
                Student zs = new Student("zhangsan",25,"LF","jsd2303","001");
                zs.eat();
                zs.sleep();
                zs.sayHi(); //调用Student类的sayHi()
                zs.study();
        
                Teacher ls = new Teacher("lisi",24,"JMS",6000.0);
                ls.eat();
                ls.sleep();
                ls.sayHi(); //调用Teacher类的sayHi()
                ls.teach();
        
                Doctor ww = new Doctor("wangwu",26,"SD","主治医师");
                ww.eat();
                ww.sleep();
                ww.sayHi(); //调用Person类的sayHi()
                ww.cut();
            }
        }
        ```

2. Animal、Dog、Chick、Fish和AnimalTest类

      - Animal类：name、age、color、Animal(参)、drink()、eat()

   - Dog类：继承Animal，重写eat()、lookHome()

   - Chick类：继承Animal，重写eat()、layEggs()
   
   - Fish类：继承Animal，重写eat()
   
   - AnimalTest：创建3个Dog对象、3个Chick对象、2个Fish对象，并测试
   
     ```java
     package ooday02;
     /**
      * 动物类
      */
     public class Animal {
         String name;
         int age;
         String color;
         Animal(){
         }
         Animal(String name,int age,String color){
             this.name = name;
             this.age = age;
             this.color = color;
         }
     
         void drink(){
             System.out.println(color+"色的"+age+"岁的"+name+"正在喝水...");
         }
         void eat(){ //---------------明天继续改造
             System.out.println(color+"色的"+age+"岁的"+name+"正在吃饭...");
         }
     }
     
     package ooday02;
     /**
      * 小狗---继承了Animal
      */
     public class Dog extends Animal {
         Dog(){
         }
         Dog(String name,int age,String color){
             super(name,age,color);
         }
     
         void lookHome(){
             System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在看家...");
         }
         void eat(){
             System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在吃骨头...");
         }
     }
     
     package ooday02;
     /**
      * 小鸡---继承了Animal
      */
     public class Chick extends Animal {
         Chick(){
         }
         Chick(String name,int age,String color){
             super(name,age,color);
         }
         void layEggs(){
             System.out.println(color+"色的"+age+"岁的小鸡"+name+"正在下蛋...");
         }
         void eat(){
             System.out.println(color+"色的"+age+"岁的小鸡"+name+"正在吃小米...");
         }
     }
     
     package ooday02;
     /**
      * 小鱼---继承了Animal
      */
     public class Fish extends Animal {
         Fish(){
         }
         Fish(String name,int age,String color){
             super(name,age,color);
         }
         void eat(){
             System.out.println(color+"色的"+age+"岁的小鱼"+name+"正在吃小虾...");
         }
     }
     
     package ooday02;
     /**
      * 动物测试类
      */
     public class AnimalTest {
         public static void main(String[] args) {
             Dog dog1 = new Dog("小黑",2,"黑");
             dog1.eat();
             dog1.drink();
             dog1.lookHome();
     
             Dog dog2 = new Dog("小白",1,"白");
             dog2.eat();
             dog2.drink();
             dog2.lookHome();
     
             Dog dog3 = new Dog("小强",2,"黑白");
             dog3.eat();
             dog3.drink();
             dog3.lookHome();
     
             Chick chick = new Chick("花花",1,"棕");
             chick.eat();
             chick.drink();
             chick.layEggs();
     
             Fish fish = new Fish("金金",2,"金");
             fish.eat();
             fish.drink();
         }
     }
     ```
     
     
   
   

