class WashingMachine extends Appliance {
    @Override
    public void start() {
        System.out.println("Starting washing cycle...");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning drum with vinegar...");
    }
}