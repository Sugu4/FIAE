public class Switch {
    public static void main(String[] args) {
        String x ="hallo";

        switch (x) {
            case "1":
                System.out.println(true);
                break;
            case "hallo":
                System.out.println(false);
                break;
            default:
                System.out.println("egal");
        }

        enum color {METER, CENTIMETER, MILLIMETER};
        color y = color.MILLIMETER;
        switch (y) {
            case color.MILLIMETER:
                convertMeterToMillimeter(1);
                break;
            case color.METER :
            default:
                break;
        }
        
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println(i * 5);
                continue;
            }
            System.out.println(i);
        }
        int iter = 0; 
        int iter2 = 0; 
        while (iter > -4) {
            System.out.println(iter--);
        }

        do {
            System.out.println(iter2);
            iter2++;
        } while (iter2 < 4);
        
    }
    static void convertMeterToMillimeter(long i){
            System.out.println(i * 100 * 10 + "mm");
        }
}
