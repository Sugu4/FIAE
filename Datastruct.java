import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Datastruct {

    public static void main(String[] args) {
                 //  0  1  2
        int[] arr = {1, 2, 3};

        int[] arr2 = new int[3];

        String[][] multStr = {{"monkey", "gorilla", "lemur"},{"donkey", "horse", "muli"}};

        boolean[][][][][] barray = {{{{{true,false}}}}};
        arr[0] = 4;

        // System.out.println(barray[0][0][0][0][1]);

        // for(int i = 0; i < multStr.length; i++){
        //     for(int j = 0; j < multStr[i].length; j++){
        //         System.out.println(multStr[i][j]);
        //     }   
        // }

        ArrayList<String> str = new ArrayList<>();
        str.add("hawk");
        str.add(1,"falcon");
        str.add(1,"blue jay");
        // str.remove("hawk");
        // str.remove(1);

       

        Integer i = Integer.parseInt("2025");
        
        ArrayList<ArrayList<ArrayList<Integer>>> zahlen2 = new ArrayList<>(10);
        zahlen2.add(new ArrayList<>());
        zahlen2.add(1, new ArrayList<>());
        zahlen2.get(0).add(new ArrayList<>());
        zahlen2.get(1).add(new ArrayList<>());
        zahlen2.get(1).add(1, new ArrayList<>());
        
        zahlen2.get(0).get(0).add(41);
        zahlen2.get(1).get(1).add(12);
        ArrayList<ArrayList<ArrayList<Integer>>> zahlen = new ArrayList<>(zahlen2);
        zahlen.get(0).get(0).set(0, 255);
        Collections.sort(str);

        HashSet<Integer> s = new HashSet<Integer>();
        s.add(1); 
        s.add(1); 
        s.add(2); 
        s.add(1); 
        s.add(3); 
        s.add(2); 
        s.add(2);


        Map<String, String> m = new HashMap<>();
        m.put("Alex", "1234");
        m.put("Sofia", "hallo");
        // m.put(3, "Glasgow");
        // m.put(4, "Mumbai");
        // m.put(5, "Bombay");
        // m.put(5, "Sydney");

        // System.out.println(m.get("GB"));

        int x = 0;
        char y = 'a';
        if(m.get("Sofia").equals("hallo")){
            if("rolle" == "user"){

            }else if (LocalDate.now().equals(LocalDate.parse("2025-08-26"))){
                System.out.println(LocalDate.now());
            }
            System.out.println("if == true");
        } else if(m.get("Sofia").equals("1234")){
            System.out.println("else if == true");
        }else {
            System.out.println("username or password is wrong!");
        }

        if ((x == 0 || x == 10) && y == 'a') {
            System.out.println("true");
        }
    }
    
}
