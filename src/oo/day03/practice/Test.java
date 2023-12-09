package oo.day03.practice;

public class Test {
    public static void main(String[] args) {
        DirectorOfTeachingAndResearch directorOfTeachingAndResearch = new DirectorOfTeachingAndResearch("路人甲", 45, 20000);
        directorOfTeachingAndResearch.clockInAtWork();
        directorOfTeachingAndResearch.editingBooks();
        directorOfTeachingAndResearch.work();
        directorOfTeachingAndResearch.solvingProblems();
        directorOfTeachingAndResearch.trainEmployees();
        directorOfTeachingAndResearch.clockInAfterWork();
    }

}
