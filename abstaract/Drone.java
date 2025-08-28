package abstaract;

public class Drone implements RcDevice {

    private double[][] coords = new double[100][3];
    private double[][] start = new double[100][3];

    public Drone() {
        Random r = new Random();

        for(int i = 0; i < coords.length;i++) {
            for(int j = 0; j < coords[i],length; j++) {
                coords[i][j] = r.nextDouble(100);
            }
        }
        start = coords[0];
    }

    public double[][] flightPlan() {
        double wayPoint = 0.0;
        double[] arr = new double[3];
        for(int i = 0; i < coords.length - 1; i++) {
            double wayPoint = 0.0;
            for(int j = 1; j < coords.length; j++) {
                wayPoint += Math.sqrt(Math.pow((coords[j][0] - coords[j-1][0]), 2) +
                                     Math.pow((coords[j][1] - coords[j-1][1]), 2) +
                                     Math.pow((coords[j][2] - coords[j-1][2]), 2));
            }
            
        }
    }

    public void changeHeight(int z) {
        System.out.println("Drone height changed to: " + z);
    }

    @Override
    public void turnLeft() {
        System.out.println("Drone turned left.");
    }

    @Override
    public void turnRight() {
        System.out.println("Drone turned right.");
    }

    @Override
    public void moveForward(int x) {
        System.out.println("Drone moved forward by: " + x);
    }

    @Override
    public void moveBackward(int x) {
        System.out.println("Drone moved backward by: " + x);
    }

    @Override
    public void accelerate() {
        System.out.println("Drone is accelerating.");
    }

    @Override
    public void slowDown() {
        System.out.println("Drone is slowing down.");
    }
    
}
