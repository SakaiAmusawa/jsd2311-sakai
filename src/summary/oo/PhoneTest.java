package summary.oo;

public class PhoneTest {
    public static void main(String[] args) {
        Phone huaWei = new Phone("华为", 9.7, 6500, "白色");
        huaWei.callPhone();
        huaWei.sendMessage();
        huaWei.lookShow();

        System.out.println("品牌:" + huaWei.brand);
        System.out.println("尺寸:" + huaWei.size);
        System.out.println("价格:" + huaWei.price);
        System.out.println("颜色:" + huaWei.color);
    }
}
