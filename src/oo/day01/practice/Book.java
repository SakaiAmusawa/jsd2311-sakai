package oo.day01.practice;

/*
1. 创建一个 Book 类，包含以下属性和方法：
属性：

title（书名）
author（作者）
numPages（页数）
currentPage（当前页）
方法：

openBook()：输出“打开书籍：[书名]”
turnToPage(int page)：将当前页数设置为指定页数
readPage()：输出“正在阅读第 [当前页] 页”
 */
public class Book {
    String title;
    String author;
    int numPages;
    int currentPage;

    Book(String title, String author, int numPages, int currentPage) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.currentPage = currentPage;
    }

    void openBook() {
        System.out.println("open:[" + title + "]" + " author is " + author);
    }

    void turnToPage(int page) {
        System.out.println("open:[" + title + "]" + " turn to page " + page);
    }

    void readPage() {
        System.out.println("reading [" + currentPage + "]");
    }
}
