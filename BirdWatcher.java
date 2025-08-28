import visibility.Goose;
import visibility.MotherDuck;

public class BirdWatcher extends Goose {

    void test() {
        Goose goose = new Goose();
        swim();
        InnerBirdWatcher b = new InnerBirdWatcher();
    }

    private class InnerBirdWatcher {

    }

}
