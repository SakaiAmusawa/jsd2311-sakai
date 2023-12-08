package sakai.oo.parctice;

public class Student extends SchoolMember {
    String className;
    String stuID;

    public Student(String name, int age, String address, String position, String className, String stuID) {
        super(name, age, address, position);
        this.className = className;
        this.stuID = stuID;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("className:" + className);
        System.out.println("StudentID:" + stuID);
    }
}
