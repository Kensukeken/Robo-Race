class Thing {
    private String name;
    private int position;

    public Thing(String name, int startPosition) {
        this.name = name;
        this.position = startPosition;
    }

    public void move(int newPosition) {
        position = newPosition;
        System.out.println(name + " moved to position " + position);
    }
}

class RobotMover {
    private int position;

    public RobotMover(int startPosition) {
        this.position = startPosition;
    }

    public void moveTo(int newPosition) {
        position = newPosition;
        System.out.println("Robot moved to position " + position);
    }

    public void moveThing(Thing thing, int newPosition) {
        moveTo(newPosition);
        thing.move(newPosition);
    }
}

public class RobotMoverApp {
    public static void main(String[] args) {
        RobotMover robot = new RobotMover(0);
        Thing thing = new Thing("Box", 0);
        
        robot.moveThing(thing, 5);
        System.out.println("Thing successfully moved.");
    }
}
