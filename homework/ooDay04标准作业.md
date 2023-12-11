# 面向对象第四天标准作业：

## 列表：

1. Animal、Swim、Dog、Chick、Fish、Master、Test类：

   - Animal类：name、age、color、Animal(参)、drink()、eat()
   - Swim接口：swim()
   - Dog类：继承Animal、实现Swim接口，重写eat()、lookHome()、重写swim()
   - Chick类：继承Animal，重写eat()、layEggs()
   - Fish类：继承Animal、实现Swim接口，重写eat()、重写swim()
   - Master类：feed()喂动物
   - Test：创建Animal数组并填充Dog/Chick/Fish对象，遍历数组：
     - 输出每个动物的名字，让每个动物吃饭、喝水
     - 若为Dog，则让它看家。若为Chick，则让它下蛋。若能游泳，则让它游泳。
     - 创建Master对象、Dog对象、Fish对象、Chick对象，并喂养动物
2. 匿名内部类练习：

   - 创建接口Inter
   - 创建接口InterInter，包含抽象方法show()
   - 创建类InnerTest，在main中：创建2个Inter的匿名内部类对象，创建两个InterInter的匿名内部类对象



## 参考：

1. Animal、Swim、Dog、Chick、Fish、Master、Test类：

   - Animal类：name、age、color、Animal(参)、drink()、eat()
   - Swim接口：swim()
   - Dog类：继承Animal、实现Swim接口，重写eat()、lookHome()、重写swim()
   - Chick类：继承Animal，重写eat()、layEggs()
   - Fish类：继承Animal、实现Swim接口，重写eat()、重写swim()
   - Master类：feed()喂动物
   - Test：创建Animal数组并填充Dog/Chick/Fish对象，遍历数组：
     - 输出每个动物的名字，让每个动物吃饭、喝水
     - 若为Dog，则让它看家。若为Chick，则让它下蛋。若能游泳，则让它游泳。

   参考代码：

   ```java
   package ooday04;
   /**
    * 动物类
    */
   public abstract class Animal {
       String name;
       int age;
       String color;
       Animal(String name,int age,String color){
           this.name = name;
           this.age = age;
           this.color = color;
       }
   
       void drink(){
           System.out.println(color+"色的"+age+"岁的"+name+"正在喝水...");
       }
       abstract void eat();
   }
   
   package ooday04;
   /**
    * 游泳接口
    */
   public interface Swim {
       /** 游泳 */
       void swim();
   }
   
   package ooday04;
   /**
    * 小狗---继承了Animal
    */
   public class Dog extends Animal implements Swim {
       Dog(String name,int age,String color){
           super(name,age,color);
       }
   
       void lookHome(){
           System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在看家...");
       }
       void eat(){
           System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在吃骨头...");
       }
   
       /** 重写接口中的抽象方法 */
       public void swim(){
           System.out.println(color+"色的"+age+"岁的狗狗"+name+"正在游泳...");
       }
   }
   
   package ooday04;
   /**
    * 小鱼---继承了Animal
    */
   public class Fish extends Animal implements Swim {
       Fish(String name,int age,String color){
           super(name,age,color);
       }
       void eat(){
           System.out.println(color+"色的"+age+"岁的小鱼"+name+"正在吃小虾...");
       }
   
       /** 重写接口中的抽象方法 */
       public void swim(){
           System.out.println(color+"色的"+age+"岁的小鱼"+name+"正在游泳...");
       }
   }
   
   package ooday04;
   /**
    * 小鸡---继承了Animal
    */
   public class Chick extends Animal {
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
   
   package ooday04;
   /**
    * 主人类
    */
   public class Master {
       void feed(Animal animal){ //喂动物
           animal.eat();
       }
   }
   
   package ooday04;
   /**
    * 演示多态
    */
   public class Test {
       public static void main(String[] args) {
           /*
           //演示向上造型(多态)的第2点应用:
           Master master = new Master();
           Dog dog = new Dog("小黑",2,"黑");
           Chick chick = new Chick("小花",3,"花");
           Fish fish = new Fish("小金",1,"金");
           master.feed(dog); //在传参的同时，系统自动做了向上造型
           master.feed(chick);
           master.feed(fish);
           */
   
           //演示向上造型(多态)的第1点应用:
           //Animal o = new Animal(); //编译错误，抽象类不能被实例化
           Animal[] animals = new Animal[5];
           animals[0] = new Dog("小黑",2,"黑"); //向上造型
           animals[1] = new Dog("小白",1,"白");
           animals[2] = new Fish("小金",1,"金");
           animals[3] = new Fish("小花",2,"花");
           animals[4] = new Chick("小灰",3,"灰");
           for(int i=0;i<animals.length;i++){ //遍历所有动物
               System.out.println(animals[i].name); //输出每个动物的名字
               animals[i].eat();   //每个动物吃饭
               animals[i].drink(); //每个动物喝水
   
               if(animals[i] instanceof Dog){
                   Dog dog = (Dog)animals[i];
                   dog.lookHome();
               }
               if(animals[i] instanceof Chick){
                   Chick chick = (Chick)animals[i];
                   chick.layEggs();
               }
               if(animals[i] instanceof Swim){ //适用于所有实现Swim接口的(会游泳的)
                   Swim s = (Swim)animals[i];
                   s.swim();
               }
           }
       }
   }
   ```

   

2. 匿名内部类练习：

   - 创建接口Inter
   - 创建接口InterInter，包含抽象方法show()
   - 创建类InnerTest，在main中：创建2个Inter的匿名内部类对象，创建两个InterInter的匿名内部类对象
   
   参考代码：

   ```java
   interface Inter{
   }
   interface InterInter{
       void show();
   }
   
   public class InnerTest {
       public static void main(String[] args) {
           Inter o1 = new Inter(){};
           Inter o2 = new Inter(){};
   
           InterInter o3 = new InterInter(){
               public void show(){
                   System.out.println("show1");
               }
           };
           o3.show();
           
           InterInter o4 = new InterInter(){
               public void show(){
                   System.out.println("show2");
               }
           };
           o4.show();
       }
   }
   ```
   
   



