class CleaningRobot extends Robot {
    @Override
    public void move() {
        System.out.println("Cleaning robot is moving around the room...");
    }

    @Override
    public void work() {
        System.out.println("Cleaning robot is vacuuming the floor...");
    }
}