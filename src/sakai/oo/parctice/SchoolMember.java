package sakai.oo.parctice;

public class SchoolMember {
    String name;
    int age;
    String address;
    String position;

    SchoolMember() {

    }

    public SchoolMember(String name, int age, String address, String position) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.position = position;
    }

    void displayInfo() {
        System.out.println(position + " Info:");
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("address:" + address);
    }

}
