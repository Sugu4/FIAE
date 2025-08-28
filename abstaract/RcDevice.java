package abstaract;

public interface RcDevice {
    int x = 0;
    int y = 0;
    int z = 0;

    void changeHeight (int z);

    void turnLeft();

    void turnRight();

    void moveForward(int x);

    void moveBackward(int x);

    void accelerate();

    void slowDown();

}
