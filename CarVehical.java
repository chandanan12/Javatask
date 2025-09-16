class CarVehical {

    public static void start() {
        System.out.println("Car started");
        accelerate();
    }

    public static void accelerate() {
        System.out.println("Car is accelerating");
        changeGear();
    }

    public static void changeGear() {
        System.out.println("Gear changed");
        applyBrakes();
    }

    public static void applyBrakes() {
        System.out.println("Brakes applied");
        stop();
    }

    public static void stop() {
        System.out.println("Car stopped");
    }

    public static void main(String[] args) {
        Car.start();
    }
}
