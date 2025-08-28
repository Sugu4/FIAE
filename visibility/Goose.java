package visibility;

public class Goose {

    protected void swim(){
        Bird bird = new Bird();
        bird.floatInWater();
    }
    void main(){
        swim();
    }
}
