package sakai.oo.parctice;

import static sakai.DividingLine.dividingLine;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("sakai", 24, "cn", "Student", "jsd2311", "02263016");
        student.displayInfo();
        dividingLine();
        Teacher teacher = new Teacher("sun", 28, "cn", "Teacher", 6500);
        teacher.displayInfo();
        dividingLine();
        SchoolMember schoolMember = new SchoolMember("alpha", 50, "weifang", "School Member");
        schoolMember.displayInfo();
    }
}
