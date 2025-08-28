package abstaract;

public class Boat implements RcDevice {

	@Override
	public void moveBackward(int distance) {
		// Implementation for moving the boat backward
	}

	@Override
	public void changeHeight(int height) {
		// Boats typically do not change height, but method must be implemented
	}

	@Override
	public void turnRight() {
		// Implementation for turning the boat right
	}

	@Override
	public void slowDown() {
		// Implementation for slowing down the boat
	}

	@Override
	public void moveForward(int distance) {
		// Implementation for moving the boat forward
	}

	@Override
	public void turnLeft() {
		// Implementation for turning the boat left
	}

	@Override
	public void accelerate() {
		// Implementation for accelerating the boat
	}
}
