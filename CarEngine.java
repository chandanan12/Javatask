class CarEngine extends Engine {
    public void accelerate() {
        System.out.println("Car engine is accelerating...");
    }

    public static void main(String[] args) {
        Machine m = new Machine();
        m.powerOn();

        Machine ref = new Engine();
        ref.powerOn();

        Engine e = new Engine();
        e.powerOn();
        e.startEngine();

        CarEngine c = new CarEngine();
        c.powerOn();
        c.startEngine();
        c.accelerate();

        Engine eRef = c;
        eRef.startEngine();
        eRef.powerOn();
    }
}