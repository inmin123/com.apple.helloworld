package com.classbook.chapter.six.innerclass;

/**
 * @program: classprogram
 * @Description:
 * @author: 郑敏
 */
public class Circle {
    private double radius = 0;
    public static int count =1;

    public Circle(double radius) {
        this.radius = radius;
        getDrawInstance().drawShape();
    }

    private Draw getDrawInstance() {
        return new Draw();
    }

    class Draw {
        public void drawShape() {
            System.out.println("drawshape");

            System.out.println(radius);

            System.out.println(count);
        }
    }
}
