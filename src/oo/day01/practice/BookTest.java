package oo.day01.practice;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("how to drink tea", "zjw", 10, 5);
        book.openBook();
        book.readPage();
        book.turnToPage(6);
    }
}
