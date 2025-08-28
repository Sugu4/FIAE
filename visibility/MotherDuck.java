package visibility;

public class MotherDuck {
    String noise = "quack";

    void quack(){
        System.out.println(noise);
    }

    void makeNoise(){
        quack();
    }
}
