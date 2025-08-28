package oop;

import oop.inheritance.Bunny;
import oop.inheritance.Mammals;

public class Main {
    public static void main(String[] args) {
        // Bunny buggs = new Bunny("beige", true, 030);
        // Mammals lola = buggs;
        // Bunny plackyDuck = (Bunny) lola;
        // Hop hop = (Hop) lola;
        // hop.jump(15);
        // System.out.println(lola + "\n" + buggs + "\n");

        // Bunny b = new Bunny();
        // System.out.println(b.fur);
        // Lemur lemur = new Lemur(true, "coast");
        // lemur.setHabitat("desert");
        // System.out.println(lemur.habitat(lemur.getHabitat()));

        User klaus = new User("klausi59", "Hallo123!");
        Integer g = 2147483647;
        System.out.println((int) Math.round(4.49));
        klaus.changePassword("Hallo123!", "Hallo123!!", "Hallo123!!");
        System.out.println(klaus.login("Hallo123!!", "klausi59"));
    }
}
