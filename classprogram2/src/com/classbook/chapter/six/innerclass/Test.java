package com.classbook.chapter.six.innerclass;

/**
 * @program: classprogram
 * @Description:
 * @author: 郑敏
 */
public class Test {
    public static void main(String[] args)  {

        Outter outter = new Outter();
        Outter.Inner inner = outter.new Inner();
        Outter.Inner inner1 = outter.getInnerInstance();
    }
}
