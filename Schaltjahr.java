public class Schaltjahr {

    public static void main(String[] args) {
        // Jahr / 4 = Schaltjahr ✔
        // Jahr / 100 = Schaltjahr WENN!!! ✔
        // Jahr / 400 ✔
        // Start 1582 ✔(╯°□°）╯︵ ┻━┻

        Integer[] arr = { 725, 2003, 1789, 1601, 1602, 1996, 1900, 2000 };
        for(Integer x : arr){
            System.out.println(x);
        }
        
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i] + " " + schaltJahrUeberpruefung(arr[i]));

        }
        schaltJahrUeberpruefung(arr);
    }

    public static Boolean schaltJahrUeberpruefung(Integer jahr) {
        boolean bool = false;
        if (jahr > 1582) {
            if (jahr % 4 == 0) {
                if (jahr % 100 == 0) {
                    if (jahr % 400 == 0) {
                        bool = true;
                    }
                } else {
                    bool = true;
                }
            }
        }
        return bool;
    }

    public static void schaltJahrUeberpruefung(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean b = arr[i] > 1582 || arr[i] == null
                    ? arr[i] % 4 == 0 
                        ? arr[i] % 100 == 0 
                            ? arr[i] % 400 == 0 
                                ? true : 
                            false : 
                        true  
                    :false
                : false;
            // System.out.println(b);
        }
    }
}
