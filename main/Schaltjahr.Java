

integer[] arr = {725, 2003, 1789, 1601, 1602, 1996, 1900, 2000};

for (int i = 0; i < arr.legth; i++) {
    System.out.println(arr[i] + " " + schaltJahrUeberpruefung(arr[i]));
}

public static boolean schaltJahrUeberpruefung(Inter jahr) {
    boolean bool = false;
    if (jahr > 1582) {
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    bool = true;
                {
            }else {
                bool = true;
            }
        }
        return bool;
    } 


}