class MountainClimber {
    private int position;
    private boolean hasFlag;

    public MountainClimber(int startPosition) {
        this.position = startPosition;
        this.hasFlag = false;
    }

    public void pickUpFlag() {
        hasFlag = true;
        System.out.println("Flag picked up.");
    }

    public void moveUp() {
        position++;
        System.out.println("Climber moved up to position " + position);
    }

    public void moveDown() {
        position--;
        System.out.println("Climber moved down to position " + position);
    }

    public void plantFlag() {
        if (hasFlag) {
            System.out.println("Flag planted at the top.");
        } else {
            System.out.println("No flag to plant.");
        }
    }
}

public class MountainClimberApp {
    public static void main(String[] args) {
        MountainClimber climber = new MountainClimber(0);

        climber.pickUpFlag();
        climber.moveUp();
        climber.moveUp();  // Climb up the mountain
        climber.plantFlag();
        climber.moveDown();  // Descend the mountain
    }
}
