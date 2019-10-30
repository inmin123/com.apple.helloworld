package com.classbook.chapter.six;

/**
 * @program: classprogram
 * @Description:
 * @author: 郑敏
 */
public class PagesBook extends Pages {
    @Override
    void content() {
        System.out.println("this is a page of book");
    }

    @Override
    void type() {
        System.out.println("this is a dictionary");
    }
}
