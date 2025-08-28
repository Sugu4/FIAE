package main;

import java.util.Random;

public class Main{


    public static void main(String[] args) {
        // double a = Math.PI * 2;

        Random r = new Random(10);
        // System.out.println(r.nextInt(10));
        // System.out.println(r.nextInt(10));
        // System.out.println(r.nextInt(10));
        // System.out.println(r.nextInt(10));
        // System.out.println(r.nextInt(10));
        // System.out.println(r.nextInt(10));
        // String str = strConcat("String.valueOf(2)", " welt");
        // System.out.println(str);

        boolean bool = false; // true
        byte b8 = 123;
        short sh = 123;
        int i = 123;
        long l = 12345;
        float f = 2.2f;
        double d = 2.2;
        char chr = 'q'; 

        System.out.println(0b11 ^ 0b10); //3
        System.out.println(017);
        System.out.println(0x10);

        String str = " Array of Characters";
        String str2 = " Array of Characters ";
        System.out.println(str.hashCode() + "\n" + str2.hashCode());
        // i = i + 2
        i += 2;
        i *= 5;
        System.out.println(java.lang.Math.pow(i, 0.5));
        
    }

    public static String strConcat(String a, String b){
        return a.concat(b);
    }  


}
