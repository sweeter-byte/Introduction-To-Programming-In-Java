/*
 * Day1: 图书管理模块实现
 */
// 1. Book.java - 图书实体类
package main.java.com.library.model;

import java.time.LocalDate;
import java.util.Objects;

/*
 * 图书实体类
 * 封装图书的基本信息和状态
 */
public class Book {
    private String bookId;          // 图书ID,唯一标志
    private String title;           // 书名
    private String author;          // 作者
    private String category;        // 分类
    private double price;           // 价格
    private int totalCopies;        // 总册数
    private int availableCopies;    // 可借册数
    private LocalDate publishDate;    // 出版日期
    private String isbn;            // ISBN号
    private String publisher;       // 出版社


    // 默认构造函数
    public Book(){}

    // 带参构造函数
    public Book(String bookId, String title, String author, String category, double price,
                int totalCopies, LocalDate publishDate, String isbn, String publisher) {
                    this.bookId = bookId;
                    this.title = title;
                    this.author = author;
                    this.category = category;
                    this.price = price;
                    this.totalCopies = totalCopies;
                    this.availableCopies = totalCopies; // 初始借阅量等于总数
                    this.publishDate = publishDate;
                    this.isbn = isbn;
                    this.publisher = publisher;
                }

    // 简化构造方法
    public Book(String title, String author, String category, double price, int totalCopies) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    // Getter Setter 方法
    public String getBookId(){
        return bookId;
    }

    public void setBookId(String bookId){
        this.bookId = bookId;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalCopies(int totalCopies) {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    public LocalDate getPublicDate(){
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // 业务方法
    /*
     * 检查图书是否可借
     */
    public boolean isAvailable() {
        return availableCopies > 0;
    }

    /*
     * 借出一本书
     */
    public boolean borrowCopy() {
        if(isAvailable()) {
            availableCopies--;
            return true;
        }
        return false;
    }

    /*
     * 归还一本书
     */
    public boolean returnCopy() {
        if(availableCopies < totalCopies) {
            availableCopies++;
            return true;
        }
        return false;
    }

    /*
     * 获取借出册数
     */
    public int getBorrowedCopies() {
        return totalCopies - availableCopies;
    }

    // equals 和 hashCode方法 (基于bookId)
    /*
     * 判断两个图书对象是否代表同一本书，判断依据是bookId相同
     */
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookId, book.bookId);

    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }

    // toString 方法
    @Override
    public String toString() {
        return String.format("Book{ID='%s', 书名='%s', 作者='%s', 分类='%s', 价格=%.2f, 总数=%d, 可借=%d}",
        bookId, title, author, category, price, totalCopies, availableCopies);
    }
}
