class Robot {
    private String name;
    private int position;

    public Robot(String name, int startPosition) {
        this.name = name;
        this.position = startPosition;
    }

    public void move() {
        position++;
        System.out.println(name + " moved to position " + position);
    }

    public int getPosition() {
        return position;
    }
}

public class RoboRace {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Robot1", 0);
        Robot robot2 = new Robot("Robot2", 0);
        
        while (robot1.getPosition() < 10 && robot2.getPosition() < 10) {
            robot1.move();
            robot2.move();
        }

        System.out.println("Both robots have reached their destination.");
    }
}
