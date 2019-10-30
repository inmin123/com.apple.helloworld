package com.classbook.chapter.six;

/**
 * @program: classprogram
 * @Description:
 * @author: 郑敏
 */
public class BookServiceImpl implements BookService {
    /**
     * @Description: to show read the book
     * @return: void
     * @Author: 郑敏
     */
    @Override
    public void readBook() {
        System.out.println("read the book!");
    }

    /**
     * @Description: to show borrow the book
     * @return: void
     * @Author: 郑敏
     */
    @Override
    public void borrowBook() {
        System.out.println("borrow the book!");
    }
}
