package oop;

public class Lemur extends Primate {
    private boolean hasTail;
    private String habitat;
    // private boolean isAlive;

    public Lemur(boolean hasTail, String habitat) {
        this.habitat = habitat;
        this.hasTail = hasTail;
    }

    public Lemur(boolean hasTail) {
        this.hasTail = hasTail;
    }

    // public Lemur(boolean isAlive){} //Compile-Error

    public Lemur() {
    };

    public boolean hasTail() {
        return true;
    }

    public String hasTail(boolean maybe) {
        return "Maybe";
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // public static void main(String[] args) {
    // Lemur lemur = new Lemur();
    // Lemur lemur2 = new Lemur(true);
    // Lemur lemur3 = new Lemur(false, "jungle");
    // System.out.println(lemur.hasTail);
    // System.out.println(lemur2.hasTail);
    // System.out.println(lemur3.hasTail);
    // System.out.println(lemur3.hasTail(false));
    // System.out.println(lemur3.hasTail());
    // System.out.println(lemur3.habitat(lemur3.habitat));
    // }
}
