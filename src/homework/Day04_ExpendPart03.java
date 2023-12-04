package homework;

//输出1900到2023年之间所有的闰年(每够10个年份，换一行)
/*
设计：
for循环逐个计算出1900~2023年之间123年中的闰年 int i = 1900 int i <=2023 i++ if...
每十个换行 ：声明一个变量times 没找到一个闰年次数加1 当time%10=0时 加一句 System.out.println()
 */
public class Day04_ExpendPart03 {
    public static void main(String[] args) {
        int times = 0;
        for (int years = 1900; years <= 2023; years++) {
            //判断是否为闰年
            if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0) {
                System.out.print(years + "\t");
                //每个闰年times+1
                times++;
                //当闰年个数为十的倍数时 换一次行
                if (times % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
