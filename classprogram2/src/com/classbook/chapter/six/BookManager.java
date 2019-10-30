package com.classbook.chapter.six;

/**
 * @program: classprogram
 * @Description:
 * @author: 郑敏
 */
public class BookManager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","CookBook",90,9);

        int pages = dictionary.pages;


        display(String.valueOf(pages));
        display(dictionary.getBookName());


        Book book = new Book("INB02","James",98);
        Book bookDictionary = new Dictionary(book,11);
        display(book.getBookId());
        display(bookDictionary.getBookId());
    }

    /**
    * @Description: 显示结果
    * @return: void
    * @Author: 郑敏
    */
    public static void display(String content){
        System.out.println(content);
    }
}
