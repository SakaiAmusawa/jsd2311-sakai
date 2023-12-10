package oo.day03.practice;

import java.util.Date;

public class DirectorOfTeachingAndResearch extends BasicInfo implements SolvingProblems, TrainEmployees, EditingBooks {

    public DirectorOfTeachingAndResearch(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void clockInAtWork() {
        Date data = new Date();
        System.out.println("当前时间" + data);
        super.clockInAtWork();
    }


    @Override
    void work() {
        System.out.println(name + "在私人办公室办公");
    }

    @Override
    public String editingBooks() {
        String s;
        s = name + "在编辑高级书籍";
        return s;
    }

    @Override
    public void solvingProblems() {
        System.out.println(name + "在解决大问题");
    }

    @Override
    public void trainEmployees() {
        System.out.println(name + "在培训所有员工");
    }

    @Override
    void clockInAfterWork() {
        Date date = new Date();
        System.out.println("当前时间" + date);
        super.clockInAfterWork();
    }
}
