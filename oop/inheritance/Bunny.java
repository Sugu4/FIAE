package oop.inheritance;

import oop.Hop;

public class Bunny extends Mammals implements Hop {
    public String fur;
    public boolean spoon;

    public Bunny(String fur, boolean spoon, int tooth) {
        boolean eyes = true;
        super(tooth, eyes);
        this.fur = fur;
        this.spoon = spoon;
    }

    public Bunny() {
        super(32, false);
    }

}
