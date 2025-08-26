package main;

public class Chick{
    private String name= "Fluffy";
    {
        System.out.println("setting field" + name);
    }

    public Chick(){
        name= "tiny";
        System.out.println("setting constructor" + name);
    }

    public static void main(String[] args) {
        Chick chick= new Chick();
        System.out.println(chick.name);
    }
}