package com.alfa.work5;

import java.util.Comparator;

public class MyComparatorColor implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape)o1;
        Shape shape2 = (Shape)o2;
        if (shape1.getColor().compareTo(shape2.getColor()) < 0) return -1;
        if (shape1.getColor().compareTo(shape2.getColor()) > 0) return 1;
        return 0;
    }
}
