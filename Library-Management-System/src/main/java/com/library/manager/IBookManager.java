// 2. IBookManager.java - 图书管理接口

package main.java.com.library.manager;

import main.java.com.library.model.Book;
import java.util.List;

/*
 * 图书管理接口
 * 定义图书管理的基本操作
 */

public interface IBookManager{
    /*
     * 添加图书
     * @param book 图书对象
     * @return 添加成功返回true
     */
    boolean addBook(Book book);

    /*
     * 根据ID删除图书
     * @param bookId 图书ID
     * @return 删除成功返回true
     */
    boolean removeBook(String bookId);

    /*
     * 更新图书信息
     * @param bookId 图书ID
     * @param newBook 新的图书信息
     * @return 更新成功返回true
     */
    boolean updateBook(String bookId, Book newBook);

    /*
     * 根据ID查找图书
     * @param bookId 图书ID
     * @return 找到的图书，未找到返回null
     */
    Book findBookById(String bookId);

    /*
     * 根据书名查找图书
     * @param title 书名(支持模糊查找)
     * @return 匹配的图书列表
     */
    List<Book> findBooksByTitle(String title);

    /*
     * 根据作者查找图书
     * @param author 作者名(支持模糊查找)
     * @return 匹配的图书列表
     */
    List<Book> findBooksByAuthor(String author);

    /*
     * 根据分类查找图书
     * @param category 分类名
     * @return 该分类下的所有图书
     */
    List<Book> findBooksByCategory(String category);

    /*
     * 获取所有图书
     * @return 所有图书列表
     */
    List<Book> getAllBooks();

    /*
     * 检查图书是否可借
     * @param bookId 图书ID
     * @return 可借返回true
     */
    boolean isBookAvailable(String bookId);

    /*
     * 获取图书总数
     * @return 图书总数
     */
    int getTotalBookCount();

    /*
     * 获取所有分类
     * @return 分类列表
     */
    List<String> getAllCategories();
}