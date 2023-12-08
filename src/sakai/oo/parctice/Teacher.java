package sakai.oo.parctice;

public class Teacher extends SchoolMember {
    double salary;

    public Teacher(String name, int age, String address, String position, double salary) {
        super(name, age, address, position);
        this.salary = salary;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("salary:" + salary);
    }
}
