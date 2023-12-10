# gitee
- https://gitee.com/JasonCN2008/jsdtn/javase
# GPT工具
- https://chat18.aichatos.xyz/
- https://ai.minihuo.com/
- https://yiyan.baidu.com/welcome
- https://passport.xfyun.cn/login

# Java官方在线学习文档
- https://docs.oracle.com/javase/tutorial/tutorialLearningPaths.html

# 知识点回顾

* Java中的继承
- 继承的定义？
- 继承关系的实现？
- 继承的特点及应用场景？
- 继承的优势、劣势？
- 继承关系中的方法重写？

* 继承关系中的super关键字应用

- 应用在哪里，作用是什么？
- 应用的形式?(super./super(参数列表))

* final关键字的应用？

- 应用在哪里？(描述类、属性、方法,局部变量)
- 分别有什么特点？(修饰类不能被继承，修饰属性和局部变量不能被重新赋值，修饰方法不能被重写)

# 今日课程目标及安排

* Java中的抽象方法
* Java中的抽象类
* Java中的接口
* Java中引用数据类型数组

# Java中抽象方法

## 何为抽象方法

由abstract关键字描述的方法为抽象方法，是派生类(子类)共性行为的一种抽象

## 抽象方法有什么特点

* 由abstract关键字修饰
* 只有方法的定义，没有方法的实现"{}",也就是没有方法体。

## 抽象方法的应用场景

* 抽象类
* 接口中

## 代码示例分析

```java

   /**求图形的面积*/
   abstract double doArea();
   /**求图形周长*/
   abstract double doPerimeter();
   
```

# Java中的抽象类？

## 何为抽象类

由abstract关键字描述类为抽象类。

## 抽象类有哪些特点

* 由abstract关键字描述
* 类中可以定义抽象方法
* 不允许实例化
* 可以被继承
* 不能使用final修饰

说明：抽象类中不一定要含有抽象方法，有时为了不允许外界对类进行实例化，可以将类声明为抽象类

## 抽象类有哪些应用场景？

* 对派生类中的共性进行抽象(例如方法的声明相同，但是实现不同)
* 不允许对类进行实例化。

## 抽象类定义代码示例

```java
/**
 * 动物类型
 */
public abstract class Animal {
    
    /**发出声音(吼)*/
    abstract void makeSound();
    
    //.....
}
```

```java
/**
 * 图形类：包含计算周长和面积的方法
 */
public abstract class Shape {
    String color;
    public Shape(String color){
        this.color=color;
    }
    /**
     * 计算面积，因为图形可能不同，所以在这里无法计算图形面积。
     */
   abstract double doArea();
    /**
     * 计算周长
     * @return
     */
    abstract double doPerimeter();
}

```

## 抽象类的派生类设计示例

```java
public class Elephant extends Animal{
    /**重写抽象类中的方法*/
    @Override
    void makeSound() {
        System.out.println("发出大象的叫声");
    }
}
public class Tiger extends Animal{
    /**重写抽象类中的方法*/
    @Override
    void makeSound() {
        System.out.println("发出老虎的叫声");
    }
}
```

```java
/**
 * 构建图形Shape类型的派生类Rectangle(长方形)
 */
public class Rectangle extends Shape{//alt+enter
    /**
     * 宽度
     */
    private double width;
    /**
     * 高度
     */
    private double height;

    public Rectangle(String color,double width,double height){
        super(color);
        this.width=width;
        this.height=height;
    }

    @Override
    double doArea() {
      return width*height;
    }
    @Override
    double doPerimeter() {
        return 2 * (width + height);
    }
}
```

# Java中的接口设计

## 何为接口

* 在java中由interface关键字定义的类型称之为接口
* 接口是一种规范，一种标准，是对具体行为的抽象。

## 接口有什么特点

* 由interface关键字描述
* 可以有多个抽象方法，默认都使用public abstract关键字修饰
* 可以有多个属性的定义，默认使用public static final 修饰。
* 一个接口可以继承多个其它接口(可以是多层继承，也可以多重继承)。
* 一个类可以实现一个或多个接口，但必须重写接口中所有抽象方法，否则这个类需要定义为抽象类。
* 一个类在继承其它类时，也可以实现多个接口，但是必须是继承在前，实现在后。

## 接口定义代码演示

```java
public interface Swim {

    /* public static final*/ int time=45;

    /**
     * 定义游泳抽象方法，在抽象类中的抽象方法，abstract关键字不能省略
     */
    /*public abstract*/ void swim();

}
```


```java
public interface Drawable {
    /**提供一个可以绘制的方法，这个方法为抽象方法*/
    void draw();
}
```

## 接口类型应用分析

```java
public class Tiger extends Animal implements Swim{
    @Override
    void makeSound() {
        System.out.println("发出老虎的叫声");
    }
    
    @Override
    public void swim() {
        System.out.println("狗刨方式的游泳");
    }
    
}

```

```java
package org.example.oop;

/**
 * 圆的类型
 * - 通过extends关键字继承Shape类型
 * - 通过implements关键字实现Drawable接
 * 注意：假如既有继承又有实现，必须是先继承后实现。
 */
public class Circle extends Shape implements Drawable{
    /**
     * 圆的半径
     */
    private double radius;

    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }

    /**
     * 实现父类的抽象方法
     * @return
     */
    @Override
    double doArea() {
        return Math.PI*radius*radius;
    }
    @Override
    double doPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public void draw() {
        System.out.println("基于圆心和半径进行圆的绘制");
    }
}
```

## 综合案例应用

```java
package org.example.oop;

import java.nio.file.Watchable;

/**
 * 岗位职责：写书
 */
interface Bookable{
    boolean doWriteBook();
}
/**岗位职责：企业内部培训*/
interface Trainable{
    boolean doTrain();
}
/**岗位职责：企业项目设计*/
interface Projectable{
    boolean doDesign();
}

/**
 * 雇员
 */
abstract class Employee{
    String name;
    int age;
    int salary;
    public Employee(String name,int age,int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    /**上班打卡*/
    abstract boolean doClockIn();
    /**下班打卡*/
    abstract boolean doClockOut();
    /**完成工作*/
    boolean doFinishWork(){
        System.out.println("完成工作");
        return true;
    }
}
/**教研总监*/
class TeachingDirector extends Employee implements Bookable,Trainable,Projectable {

    public TeachingDirector(String name,int age,int salary){
       super(name,age,salary);
    }
    @Override
    boolean doClockIn() {
        System.out.println("早上10点上班打卡");
        return false;
    }

    @Override
    boolean doClockOut() {
        System.out.println("下午19:00下班打卡");
        return false;
    }

    @Override
    public boolean doWriteBook() {
        System.out.println("设计并编写书的目录结构");
        return true;
    }

    @Override
    public boolean doTrain() {
        System.out.println("面向讲师、项目经理、职业发展、前端等进行培训");
        return true;
    }

    @Override
    public boolean doDesign() {
        System.out.println("负责授课过程中的阶段项目总体设计和规划");
        return true;
    }
}
class ProjectManager extends Employee implements Bookable{

    public ProjectManager(String name,int age,int salary){
        super(name,age,salary);
    }
    @Override
    public boolean doWriteBook() {
        System.out.println("负责编写书籍中的每小节的练习题");
        return true;
    }

    @Override
    boolean doClockIn() {
        System.out.println("上午9:00上班打卡");
        return true;
    }

    @Override
    boolean doClockOut() {
        System.out.println("下午18:00下班打卡");
        return true;
    }
}
/**班主任*/
class ClassTeacher extends Employee{

    public ClassTeacher(String name,int age,int salary){
        super(name,age,salary);
    }

    @Override
    boolean doClockIn() {
        System.out.println("早上8:30上班打卡");
        return true;
    }

    @Override
    boolean doClockOut() {
        System.out.println("下午17:30下班打卡");
        return true;
    }
}
public class WorkerTests {
    public static void main(String[] args) {
        TeachingDirector director=new TeachingDirector("周华飞",35,100000);
        director.doClockIn();
    }
}

```

# 引用类型的数组

## 何为引用类型数组

用于存储对象的数组

## 引用类型数组特点

* 数组类型为引用数据类型(又称之为对象类型)
* 存储的内容是我们构建的对象
* 其它特性与基本类型数组基本相同。

## 应用案例分析

```java
public class CircleArrayTests {
    public static void main(String[] args) {
        Circle[] array=new Circle[2]; //构建引用类型数组
        System.out.println(array[0]); //默认值为null
        array[0]=new Circle("red",10); //这里的值是我们自己构建的对象
        array[1]=new Circle("blue",20);
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i].color + "色圆的周长为" + array[i].doPerimeter());
            System.out.println(array[i].color + "色圆的面积为" + array[i].doArea());
        }
        //定义时初始化
        Circle[] array2={new Circle("black",10),new Circle("yellow",30),};
    }
}
```


# 总结(Summary)

## 重难点分析

* 抽象类与接口的定义、特点及应用场景和案例分析
* 引用类型数组(对象类型数组)的基本应用

## 小T提示

您作为Java技术专家，请给出一个学习面向对象学的最佳案例，
这个案例要求包括类，抽象类，接口的具体应用，同时要包含类
的继承，接口的继承及实现，请给出代码示例，并且示例要完整。

