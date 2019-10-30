package com.classbook.chapter.six.innerclass;

/**
 * @program: classprogram
 * @Description:
 * @author: 郑敏
 */
public class Outter {
    private Inner inner = null;
    public Outter() {

    }

    public Inner getInnerInstance() {
        if(inner == null) {
            inner = new Inner();
        }
        return inner;
    }

    protected class Inner {
        public Inner() {

        }
    }
}
