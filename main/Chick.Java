package main;

public class Chick {
    private String name = "Fluffy";
    {
        System.out.println("setting fields " + name);
    }

    public Chick(){
        name = "tiny";
        System.out.println("setting constructor " + name);
    }
    public int eggs = 4;
    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
