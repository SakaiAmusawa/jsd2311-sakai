# 语言基础第六天标准练习：

## 列表：

1. 方法的练习：

   - 要求：

     - 定义say()无参无返回值方法，调用测试
     - 定义say()有一个参无返回值方法，调用测试
     - 定义say()有两个参无返回值的方法，调用测试
     - 定义sum()两个参有返回值方法，调用测试
     - 定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试

2. 综合练习一：

   - 需求:<<主持人大赛>>有N位评委给选手打分

   - 选手的最终得分为:去掉最高分和最低分之后的N-2位评委的平均分
   - 要求:使用方法实现

3. 综合练习二：

   - 完成猜数字小游戏
   - 要求：使用while(true)自造死循环实现


## 参考

1. 方法的练习：参数

   - 定义say()无参无返回值方法，调用测试
   - 定义say()有一个参无返回值方法，调用测试
   - 定义say()有两个参无返回值的方法，调用测试

   参考代码：

   ```java
   package basic.day06;
   //方法的演示
   public class MethodDemo {
       public static void main(String[] args) {
           say();
           say("zhangsan"); //String name="zhangsan"
           say("zhangsan",25); //String name="zhangsan",int age=25
       }
       
       //无参无返回值
       public static void say(){
           System.out.println("大家好，我叫WKJ，今年38岁了");
       }
       
       //有参无返回值
       public static void say(String name){
           System.out.println("大家好，我叫"+name+"，今年38岁了");
       }
       
       //有参无返回值
       public static void say(String name,int age){
           if(age>=60){ //在某种特定条件下，提前结束方法
               return; //结束方法的执行
           }
           System.out.println("大家好，我叫"+name+"，今年"+age+"岁了");
       }
   }
   ```

2. 方法的练习：返回值

   - 定义sum()两个参有返回值方法，调用测试
   - 定义generateArray()用于生成整型数组填充随机数并返回数组，调用测试

   参考代码：

   ```java
   package basic.day06;
   //方法的演示
   public class MethodDemo {
       public static void main(String[] args) {
           int b = sum(5,6);
           System.out.println(b); //11，模拟对返回值的后续操作
           int m=5,n=6;
           int c = sum(m,n); //传递的是m和n里面的数
           System.out.println(c); //11，模拟对返回值的后续操作
   
           int[] d = generateArray(5,100); //模拟第1个人的访问
           System.out.println("数组的长度为:"+d.length); //10---模拟对返回值的后续操作
           for(int i=0;i<d.length;i++){ //---模拟对返回值的后续操作
               System.out.println(d[i]);
           }
   
           int[] e = generateArray(8,20); //模拟第2个人的访问
           System.out.println("第1个元素的值:"+e[0]); //?---模拟对返回值的后续操作
           for(int i=0;i<e.length;i++){ //---模拟对返回值的后续操作
               System.out.println(e[i]);
           }
       }
       
       //有参有返回值
       public static int sum(int num1,int num2){
           int num = num1+num2;
           return num; //返回的是num里面的那个数
           //return num1+num2; //返回num1与num2的和
       }
       
       //无参有返回值
       public static int[] generateArray(int len,int max){
           Random rand = new Random();
           int[] arr = new int[len];
           for(int i=0;i<arr.length;i++){
               arr[i] = rand.nextInt(max+1);
           }
           return arr;
       }
   }
   ```

3. 综合练习一：

   - 需求:<<主持人大赛>>有N位评委给选手打分

   * 选手的最终得分为:去掉最高分和最低分之后的N-2位评委的平均分

   * 要求:使用方法实现

     ```java
     package basic.day06;
     
     import java.util.Scanner;
     
     /**
      * 需求:<<主持人大赛>>有N位评委给选手打分
      *     选手的最终得分为:去掉最高分和最低分之后的N-2位评委的平均分
      * 要求:使用方法实现
      */
     public class CalTotalAvg {
         public static void main(String[] args) { //撒贝宁
             double[] scores = inputData(6); //1)录入评委的评分
             double avg = calAvg(scores); //2)计算平均分
             System.out.println("平均分:"+avg);
         }
     
         /** 该方法用于录入N位评委的评分 */
         public static double[] inputData(int n){
             double[] scores = new double[n]; //评分数组
             Scanner scan = new Scanner(System.in);
             for(int i=0;i<scores.length;i++){
                 System.out.println("请录入第"+(i+1)+"位评委的分数:");
                 scores[i] = scan.nextDouble();
             }
             return scores;
         }
     
         /** 该方法用于计算平均分 */
         public static double calAvg(double[] scores){
             double total = 0.0; //总分
             double max = scores[0]; //假设第1个元素为最高分
             double min = scores[0]; //假设第1个元素为最低分
             for(int i=0;i<scores.length;i++){
                 total = total+scores[i]; //累加所有评分
                 if(scores[i]>max){ //找最高分
                     max = scores[i];
                 }
                 if(scores[i]<min){ //最低分
                     min = scores[i];
                 }
             }
             //计算平均分---总分减掉最高分和最低分之后，再除以(评委数-2)
             double avg = (total-max-min)/(scores.length-2);
             return avg;
         }
     }
     ```

4. 综合练习二：

   - 完成猜数字小游戏

   - 要求：使用while(true)自造死循环实现

     ```java
     package basic.day06;
     import java.util.Random;
     import java.util.Scanner;
     /**
      * 需求:猜数字小游戏
      * 训练目标: while(true)自造死循环+break
      */
     public class Guessing {
         public static void main(String[] args) {
             Scanner scan = new Scanner(System.in);
             Random rand = new Random();
             int num = rand.nextInt(1000)+1; //1到1000
             System.out.println(num);
     
             while(true){ //自造死循环
                 System.out.println("猜吧!");
                 int guess = scan.nextInt();
                 if(guess>num){
                     System.out.println("猜大了");
                 }else if(guess<num){
                     System.out.println("猜小了");
                 }else{
                     System.out.println("恭喜你猜对了!");
                     break; //跳出循环
                 }
             }
         }
     }
     ```

