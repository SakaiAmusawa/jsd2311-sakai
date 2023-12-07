# 面向对象第一天标准作业：

## 列表：

1. Student类和StudentTest类：

   - Student类：name，age，className，stuId，构造方法()，study()，sayHi()，playWith(String anotherName)
   - StudentTest类：创建对象，访问测试

2. Car类和CarTest类：

   - Car类：brand(品牌)，color，price，构造方法()，start()、run()、stop()

   - CarTest类：创建对象，访问测试


## 参考：

1. Student类和StudentTest类：

   - Student类：name，age，className，stuId，构造方法()，study()，sayHi()，playWith(String anotherName)

   - StudentTest类：创建对象，访问测试

     ```java
     package ooday01;
     /** 学生类 */
     public class Student {
         //成员变量
         String name;
         int age;
         String className;
         String stuId;
     
         //构造方法
         Student(){
         }
         Student(String name,int age,String className,String stuId){
             this.name = name;
             this.age = age;
             this.className = className;
             this.stuId = stuId;
         }
     
         //方法
         void study(){
             System.out.println(name+"在学习...");
         }
         void sayHi(){
             System.out.println("大家好，我叫"+this.name+"，今年"+this.age+"岁了，所在班级为"+this.className+"，学号为:"+this.stuId);
         }
         void playWith(String anotherName){
             System.out.println(this.name+"正在和"+anotherName+"一起玩...");
         }
     }
     
     package ooday01;
     /** 学生类的测试类　*/
     public class StudentTest {
         public static void main(String[] args) {
             //创建一个学生对象
             Student zg = new Student();
             //访问成员变量
             zg.name = "张光";
             zg.age = 22;
             zg.className = "jsd2309";
             zg.stuId = "001";
             //调用方法
             zg.study();
             zg.sayHi();
             zg.playWith("李林");
     
             Student ll = new Student();
             ll.name = "李林";
             ll.age = 23;
             ll.className = "jsd2309";
             ll.stuId = "002";
             ll.study();
             ll.sayHi();
             ll.playWith("张光");
     		
             Student zl = new Student();
             zl.study();
             zl.sayHi();
             zl.playWith("张光");
         }
     }
     public class ConsDemo {
         public static void main(String[] args) {
             Student s = new Student();
             s.sayHi();
             Student zg = new Student("张光",23,"jsd2309","001");
             zg.sayHi();
             Student ll = new Student("李林",22,"jsd2309","002");
             ll.sayHi();
         }
     }
     ```

2. Car类和CarTest类：

   - Car类：brand(品牌)，color，price，构造方法()，start()、run()、stop()

   - CarTest类：创建对象，访问测试

     ```java
     package ooday01;
     /** 汽车类 */
     public class Car {
         String brand; //品牌
         String color; //颜色
         double price; //价格
     
         Car(){
         }
         Car(String brand,String color,double price){
             this.brand = brand;
             this.color = color;
             this.price = price;
         }
     
         void start(){
             System.out.println(brand+"牌子的"+color+"颜色的"+price+"块钱的车启动了...");
         }
         void run(){
             System.out.println(brand+"牌子的"+color+"颜色的"+price+"块钱的车开始跑了...");
         }
         void stop(){
             System.out.println(brand+"牌子的"+color+"颜色的"+price+"块钱的车停止了...");
         }
     }
     
     package ooday01;
     /** Car的测试类 */
     public class CarTest {
         public static void main(String[] args) {
             Car car1 = new Car();
             car1.brand = "奔弛";
             car1.color = "黑";
             car1.price = 80;
             car1.start();
             car1.run();
             car1.stop();
     
             Car car2 = new Car("奥迪","银",40);
             car2.start();
             car2.run();
             car2.stop();
     
             Car car3 = new Car("特斯拉","白",70);
             car3.start();
             car3.run();
             car3.stop();    
         }
     }
     ```
     


