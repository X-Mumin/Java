package com.datagear;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;

        System.out.println(point2);

    }
}
