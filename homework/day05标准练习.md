# 语言基础第五天标准练习：

## 列表

1. MultiTable九九乘法表

   要求：输出九九乘法表

2. 数组小代码练习：声明、初始化、访问、遍历、复制

3. MaxOfArray求数组元素最大值并放在最后一个元素的下一个位置

4. 对数组进行升序排列，并输出排序后的结果



## 参考

1. MultiType九九乘法表：输出九九乘法表

   参考代码：

   ```java
   package day05;
   //九九乘法表
   public class MultiTable {
       public static void main(String[] args) {
           for(int num=1;num<=9;num++){ //控制行
               for(int i=1;i<=num;i++){ //控制列
                   System.out.print(i+"*"+num+"="+i*num+"\t");
               }
               System.out.println(); //换行
           }
       }
   }
   ```

2. 数组小代码练习：声明

   - 定义至少两个数组，设计包含一些元素

   参考代码：

   ```java
   //声明整型数组arr，包含10个元素，每个元素都是int型，默认值为0
   int[] arr = new int[10];
   ```

3. 数组小代码练习：初始化

   - 定义至少三个数组，演示三种元素初始化方式

   参考代码：

   ```java
   //2)数组的初始化:--初始化的是数组中的数据
   int[] arr1 = new int[3]; //0,0,0
   int[] arr2 = {2,5,8}; //2,5,8
   int[] arr3 = new int[]{2,5,8}; //2,5,8
   int[] arr4;
   //arr4 = {2,5,8}; //编译错误，此方式只能声明同时初始化
   arr4 = new int[]{2,5,8}; //正确
   ```

4. 数组小代码练习：访问

   - 定义数组，输出数组的长度
   - 定义数组并分别给每个元素赋值，输出最后一个元素的值
   - 编写代码演示数组操作常见的异常----数组下标越界

   参考代码：

   ```java
   //3)数组的访问:--访问的是数组中的数据
   int[] arr = new int[3];
   System.out.println(arr.length); //3，输出arr的长度
   arr[0] = 100; //给arr中第1个元素赋值为100
   arr[1] = 200; //给arr中第2个元素赋值为200
   arr[2] = 300; //给arr中第3个元素赋值为300
   //arr[3] = 400; //运行时发生ArrayIndexOutOfBoundsException数组下标越界异常
   System.out.println(arr[arr.length-1]); //输出最后一个元素的值
   ```

5. 数组小代码练习：遍历

   - 定义数组，包含10个元素，遍历数组，给每个元素赋值为0到99之间的随机数，输出每个元素的值

   参考代码：

   ```java
   int[] arr = new int[10];
   for(int i=0;i<arr.length;i++){ //遍历arr数组
       arr[i] = (int)(Math.random()*100); //给每个元素赋值为0到99的随机数
       System.out.println(arr[i]); //输出每个元素的值
   }
   ```

6. 数组小代码练习：复制

   ```java
   int[] a = {10,20,30,40,50};
   //数组的扩容(创建了一个更大的新的数组，并将数据复制进去了)
   a = Arrays.copyOf(a,a.length+1);
   for(int i=0;i<a.length;i++){
       System.out.println(a[i]);
   }
   
   /*
   int[] a = {10,20,30,40,50};
   //a:源数组
   //b:目标数组
   //6:目标数组的长度
   int[] b = Arrays.copyOf(a,4);
   for(int i=0;i<b.length;i++){
       System.out.println(b[i]);
   }
   */
   /*
   int[] a = {10,20,30,40,50};
   int[] b = new int[6]; //0,0,0,0,0,0
   //a:源数组
   //1:源数组的起始下标
   //b:目标数组
   //0:目标数组的起始下标
   //4:要复制的元素个数
   System.arraycopy(a,1,b,0,4); //灵活性好
   for(int i=0;i<b.length;i++){
       System.out.println(b[i]);
   }
   */
   ```

7. MaxOfArray求数组元素最大值，并放在最后一个元素的下一个位置

   - 定义数组，包含10个元素，遍历数组，给每个元素赋值为0到99之间的随机数并输出，找到数组元素的最大值并输出，并将最大值放在最后一个元素的下一个位置

     参考代码：

     ```java
     public class MaxOfArray {
         public static void main(String[] args) {
             int[] arr = new int[10];
             for(int i=0;i<arr.length;i++){
                 arr[i] = (int)(Math.random()*100);
                 System.out.println(arr[i]);
             }
     		
             int max = arr[0]; //假设第1个元素为最大值
             for(int i=1;i<arr.length;i++){ //遍历剩余元素
                 if(arr[i]>max){   //若剩余元素大于max
                     max = arr[i]; //将max修改为较大的
                 }
             }
             System.out.println("最大值为:"+max);
             
             arr = Arrays.copyOf(arr,arr.length+1); //扩容
             arr[arr.length-1] = max; //将最大值max赋值到最后一个元素上
             for(int i=0;i<arr.length;i++){
                 System.out.println(arr[i]);
             }
         }
     }
     ```

8. 对数组进行升序排列，并输出排序后的结果

   参考代码：

   ```java
   Random rand = new Random(); //随机数对象
   int[] arr = new int[10];
   for(int i=0;i<arr.length;i++){
       arr[i] = rand.nextInt(100); //0到99的随机整数
       System.out.println(arr[i]);
   }
   
   Arrays.sort(arr); //对arr数组做升序排列
   
   System.out.println("排序后:");
   for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
   }
   
   System.out.println("倒着输出:");
   for(int i=arr.length-1;i>=0;i--){ //数据还是升序的，只是倒着展示
       System.out.println(arr[i]);
   }
   System.out.println("第1个元素为:"+arr[0]);
   ```
