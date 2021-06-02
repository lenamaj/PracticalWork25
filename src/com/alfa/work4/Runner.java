package com.alfa.work4;

public class Runner {
    public void run(){
        Integer i1 = 127;
        Integer i2= new Integer(127);
        Integer i3= new Integer("127");
        Integer i4 = Integer.valueOf(127);
        Integer i5 = Integer.valueOf("127");
        int ii = 127;
        Integer i6 = ii;


        Integer i11 = 128;
        Integer i22= new Integer(128);
        Integer i33= new Integer("128");
        Integer i44 = Integer.valueOf(128);
        Integer i55 = Integer.valueOf("128");
        int iii = 128;
        Integer i66 = iii;

        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i1 == i4);
        System.out.println(i1 == i5);
        System.out.println(i1 == i6);
        System.out.println();
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i3));
        System.out.println(i1.equals(i4));
        System.out.println(i1.equals(i5));
        System.out.println(i1.equals(i6));
        System.out.println();
        System.out.println(i11 == i22);
        System.out.println(i11 == i33);
        System.out.println(i11 == i44);
        System.out.println(i11 == i55);
        System.out.println(i11 == i66);
        System.out.println();
        System.out.println(i11.equals(i22));
        System.out.println(i11.equals(i33));
        System.out.println(i11.equals(i44));
        System.out.println(i11.equals(i55));
        System.out.println(i11.equals(i66));
        System.out.println();
        System.out.println(compute(10, 11));
        System.out.println(compute(128, 1));

    }

    public Double compute(Integer a, Integer b){

        return new Double(a + b);

    }

}
