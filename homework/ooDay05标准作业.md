# 面向对象第五天标准作业：

## 列表：

1. 完成Point类，演示访问控制修饰符的用法
2. 完成StaticVar、StaticBlock、StaticMethod，StaticDemo，演示static关键字的用法
3. 完成StaticFinalDemo，演示static final常量的用法
4. 完成Seasons和EnumTest，演示枚举的用法



## 参考：

1. 完成Point类和GetterSetter类，演示访问控制修饰符的用法

   参考代码：

   ```java
   package ooday05;
   
   /**
    * 点
    */
   public class Point {
       /*
         getter/setter的原因:
         1)很多框架的配置操作都是基于getter/setter进行的，没有它就取不到数据
           可以将设计getter/setter理解为一种行业标准
         2)可以更好的保证数据的合法性(因为方法中可以做条件控制)
         3)getter/setter可以选择性存在(只有getter(只读)，或者只有setter(只写))
        */
       private int x;
       private int y;
   
       public int getX(){
           return x;
       }
       public void setX(int x){
           if(x>=0){
               this.x = x;
           }
       }
   
       public int getY(){
           return y;
       }
       public void setY(int y){
           this.y = y;
       }
   }
   ```
   
2. 完成StaticVar、StaticBlock、StaticMethod，StaticDemo，演示static关键字的用法

   参考代码：

   ```java
   package ooday05;
   /**
    * 静态变量的演示
    */
   public class StaticVar {
       int a; //实例变量
       static int b; //静态变量
       StaticVar(){
           a++;
           b++;
       }
       void show(){
           System.out.println("a="+a+",b="+b);
       }
   }
   
   package ooday05;
   /**
    * 静态块的演示
    */
   public class StaticBlock {
       static{ //加载类的时候会自动执行，只执行一次
           System.out.println("静态块");
       }
       StaticBlock(){ //new对象时自动执行，new几个对象就执行几次
           System.out.println("构造方法");
       }
   }
   
   package ooday05;
   /**
    * 静态方法的演示
    */
   public class StaticMethod {
       int a; //实例变量(对象来访问)---------------属于对象的
       static int b; //静态变量(类名来访问)--------属于类的
   
       //何时设计静态方法: 方法的操作与对象无关(不需要访问对象的属性/行为)
   
       //在say()中需要访问对象的属性a，所以认为say的操作与对象有关，不适合设计为静态方法
       void say(){
           System.out.println(a);
       }
       //在plus()中不需要访问对象的属性/行为，所以认为plus的操作与对象无关，可以设计为静态方法
       static int plus(int num1,int num2){
           int num = num1+num2;
           return num;
       }
   
       void show(){ //有隐式this
           System.out.println(this.a);
           System.out.println(StaticMethod.b);
       }
       static void test(){ //没有隐式this
           //静态方法中没有隐式this传递
           //没有this就意味着没有对象
           //而实例变量a必须通过对象来访问
           //所以如下代码发生编译错误
           //System.out.println(a); //编译错误，静态方法中不能直接访问实例成员
           System.out.println(StaticMethod.b);
       }
   }
   
   package ooday05;
   /**
    * static的演示
    */
   public class StaticDemo {
       public static void main(String[] args) {
           //演示静态变量
           StaticVar o1 = new StaticVar();
           o1.show();
           StaticVar o2 = new StaticVar();
           o2.show();
           StaticVar o3 = new StaticVar();
           o3.show();
           System.out.println(StaticVar.b); //常常通过类名点来访问
   
           StaticBlock o4 = new StaticBlock(); //加载类时自动执行静态块
           StaticBlock o5 = new StaticBlock();
           StaticBlock o6 = new StaticBlock();
   
           StaticMethod.test(); //常常通过类名点来访问
       }
   }
   ```

3. 完成StaticFinalDemo，演示static final常量的用法

   参考代码：

   ```java
   package ooday05;
   /**
    * static final常量的演示
    */
   public class StaticFinalDemo {
       public static void main(String[] args) {
           System.out.println(Loo.PI); //常常通过类名点来访问
           //Loo.PI = 3.1415926; //编译错误，常量不能被改变
   
           //1)加载Loo.class到方法区中
           //2)静态变量num一并存储到方法区中
           //3)到方法区中获取num的值并输出
           System.out.println(Loo.num);
           //编译器在编译时会将常量直接替换为具体的数，效率高
           //相当于System.out.println(5);
           System.out.println(Loo.COUNT);
       }
   }
   //演示常量
   class Loo{
       public static int num = 5; //静态变量
       public static final int COUNT = 5; //常量(静态常量)
   
       public static final double PI = 3.14159;
       //public static final int NUM; //编译错误，常量必须声明同时初始化
   }
   ```

4. 完成Seasons和EnumTest，演示枚举的用法

   ```java
   //简单版:
   package ooday05;
   /**
    * 季节枚举
    */
   public enum Seasons {
       SPRING,SUMMER,AUTUMN,WINTER //表示Seasons的固定的4个对象，都是常量
   }
   
   package ooday05;
   /**
    * 枚举的测试类
    */
   public class EnumTest {
       public static void main(String[] args) {
           Seasons[] seasons = Seasons.values(); //获取所有枚举对象
           for(int i=0;i<seasons.length;i++){
               System.out.println(seasons[i]);
           }
           /*
           Seasons s = Seasons.WINTER; //获取WINTER对象
           switch(s){
               case SPRING:
                   System.out.println("春天到了...");
                   break;
               case SUMMER:
                   System.out.println("夏天到了...");
                   break;
               case AUTUMN:
                   System.out.println("秋天到了...");
                   break;
               case WINTER:
                   System.out.println("冬天到了...");
                   break;
           }
            */
       }
   }
   
   //复杂版:
   package ooday05_vis;
   /**
    * 季节枚举
    */
   public enum Seasons {
       SPRING("春天","暖和"),
       SUMMER("夏天","热"),
       AUTUMN("秋天","凉爽"),
       WINTER("冬天","冷");
       private String seasonName;
       private String seasonDesc;
       Seasons(String seasonName, String seasonDesc) {
           this.seasonName = seasonName;
           this.seasonDesc = seasonDesc;
       }
   
       public String getSeasonName() {
           return seasonName;
       }
       public void setSeasonName(String seasonName) {
           this.seasonName = seasonName;
       }
       public String getSeasonDesc() {
           return seasonDesc;
       }
       public void setSeasonDesc(String seasonDesc) {
           this.seasonDesc = seasonDesc;
       }
   }
   
   package ooday05_vis;
   
   /**
    * 枚举的演示
    */
   public class EnumTest {
       public static void main(String[] args) {
           Seasons s = Seasons.WINTER;
           System.out.println(s.getSeasonName()+","+s.getSeasonDesc());
   
           Seasons[] seasons = Seasons.values();
           for(int i=0;i<seasons.length;i++){
               System.out.println(seasons[i]);
               System.out.println(seasons[i].getSeasonName());
               System.out.println(seasons[i].getSeasonDesc());
           }
       }
   }
   ```

   
