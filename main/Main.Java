package main;

import java.util.Random;

public class main{


    public static void(String[] args) {
        double a= Math.PI *2;

        Random r= new Random(10);
        // System.out.println(r.nextInt(10));
        // System.out.println(r.nextInt(10));
        // System.out.println(r.nextInt(10));
        // System.out.println(r.nextInt(10));
        // System.out.println(r.nextInt(10));
        // System.out.println(r.nextInt(10));
        // String str= strConcat("String.valueOf(2))", "welt");
        // System.out.println(str);

        boolean bool= false; // true
        byte b8= 123;
        short sh= 123;
        int i= 123;
        long l= 12345;
        float f= 2.2f;
        double b= 2.2;
        char chr= 'q';

        System.out.println(0b11 ^ 0b10);
        System.out.println(0xF1);
    }

    public static String strConcat(String a, String b){
        return a.concat(b);
    }
    
}