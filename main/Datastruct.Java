package main;

import java.util.ArrayList;

public class Datastruct {

    public static void main(String[] args) {
        // 0  1  2
        int[] arr = {1, 2, 3};

        int[] arr2 = new int[3];

        String[][] multstr = {{"monkey", "gorilla", "lemur"}, {"donkey", "horse", "muli"}};

        boolean[][][][][] barray = {{{{{true, false}}}}};
        arr[0] = 4;

        System.out.println(barray[0][0][0][0][0]);

        // for(int i= 0; i < multstr.length; i++){
        //     for(int j= 0; j < multstr[i].length; j++){
        //         System.out.println(multstr[i][j]);
        //     }
        // }

        ArrayList<String> str = new ArrayList<>();
        str.add("hawk");
        str.add("falcon");
        str.add("blue jay");
        System.out.println(str.get(0));
    }
}