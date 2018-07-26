package cn.zhudi;

import java.util.ArrayList;
import java.util.Date;

//这是单行注释
public class HelloWorld {

    private static final int INITALS = 10;

    public static void main(String[] args) {
        System.out.printf("helloworld!");
        System.out.println("");
        ArrayList zhudi = new ArrayList();
        Date date = new Date();
        zhudi.add(0,"zhudi");
        method1();
        for (Object o : zhudi) {

        }
    }

    public static void method1() {
    }
}
