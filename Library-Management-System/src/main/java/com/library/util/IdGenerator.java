// 3. IdGenerator.java - ID 生成工具类
package main.java.com.library.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * 生成ID工具类
 * 生成唯一的图书、读者、借阅记录ID
 */
public class IdGenerator {
    private static final AtomicInteger bookCounter = new AtomicInteger(1);
    private static final AtomicInteger readerCounter = new AtomicInteger(1);
    private static final AtomicInteger recordCounter = new AtomicInteger(1);

    private static final DateTimeFormatter DATA_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");

    /*
     * 生成图书ID
     * 格式：B + 年月日 + 4位递增数字
     * 例：B2024089130001
     * @return 图书ID  
     */
    public static String generateBookId() {
        String data = LocalDateTime.now().format(DATA_FORMAT);
        int counter = bookCounter.getAndIncrement();
        return String.format("B%s%04d", data, counter);
    } 

    /*
     * 生成读者ID
     * 格式：R + 年月日 + 4位递增数字
     * 例：R202503120001
     * @return 读者ID
     */
    public static String generateReaderId() {
        String date = LocalDateTime.now().format(DATA_FORMAT);
        int counter = readerCounter.getAndIncrement();
        return String.format("R%s%04d", date, counter);
    }

    /*
     * 生成借阅记录ID
     * 格式：BR + 年月日 + 4位递增数字
     * 例：BR202308120001
     * @return 借阅记录ID
     */
    public static String generateBorrowRecordId() {
        String date = LocalDateTime.now().format(DATA_FORMAT);
        int counter = recordCounter.getAndIncrement();
        return String.format("BR%s%04d", date, counter);
    }
}