package oo.day01.practice;

/*
3. 创建一个 BankAccount 类，具有以下属性和方法：
属性：

accountNumber（账户号码）
ownerName（账户所有者姓名）
balance（账户余额）
方法：

deposit(double amount)：存款指定金额到账户中
withdraw(double amount)：从账户中提取指定金额
checkBalance()：输出账户余额信息
 */
public class BankAccount {
    String accountNumber;
    String ownerName;
    double price;

    BankAccount(String accountNumber, String ownerName, double price) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.price = price;
    }

    void deposit(double amount) {
        price += amount;
    }

    void withdraw(double amount) {
        price -= amount;
    }

    void checkBalance() {
        System.out.println(price);
    }

}
