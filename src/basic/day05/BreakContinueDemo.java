package basic.day05;

//break continue的使用演示（continue在实际应用中较少）
public class BreakContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "*9=" + i * 9);
            //生成一个1~9的乘法表，当i=5时break 结束循环
            if (i == 5) {
                break;
            }
            /*
            执行过程：
            i = 1 true 1*9=9  i++
            i = 2 true 2*9=18 i++
            i = 3 true 3*9=27 i++
            i = 4 true 4*9=36 i++
            i = 5 true 5*9=45 i++
            i==5 break; 程序结束
             */
        }
        for (int i = 1; i <= 9; i++) {
            if (i % 3 == 0) {
                continue;//continue的用于跳过循环体中剩余的语句（本例中：System.out.println(i + "*9=" + i * 9);），并不会直接结束循环
            }
            System.out.println(i + "*9=" + i * 9);
        }
        /*
        执行过程：
        i = 1 true 1*9=9  i++;
        i = 2 true 2*9=18 i++;
        i = 3 true i%3==0 true continue i++;
        i = 4 true 4*9=36 i++;
         */
    }
}
