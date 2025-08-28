package abstaract;

public abstract class Animal {
    String name = "Tier";

    public abstract Double mwst(Double a, Double b);
    
    public void getName() {
        System.out.println("My name is" + name);
    }
    
}
