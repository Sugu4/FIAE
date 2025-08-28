package visibility;

public class Duck {
    private String quack = "quack";

    private void quack(){
        System.out.println(quack);
    }

    private void makeNoise(){
        quack();
    }
}
