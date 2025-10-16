class Bulb {

    String brand;
    long lifetimeHours;   
    double voltage;       
    short wattage;       
    boolean isLED;      
	
    public Bulb() {
        this("Unknown", 1000L, 220.0, (short) 5, false);
        System.out.println("No-args constructor called");
    }
    public Bulb(String brand) {
        this("Philips", 2000L);
        this.brand = brand;
        System.out.println("1-arg constructor called");
        System.out.println("Brand: " + this.brand);
    }
    public Bulb(String brand, long lifetimeHours) {
        this("Havells", 3000L, 230.0);
        this.brand = brand;
        this.lifetimeHours = lifetimeHours;
        System.out.println("2-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Lifetime: " + this.lifetimeHours + " hours");
    }
    public Bulb(String brand, long lifetimeHours, double voltage) {
        this();
        this.brand = brand;
        this.lifetimeHours = lifetimeHours;
        this.voltage = voltage;
        System.out.println("3-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Lifetime: " + this.lifetimeHours + " hours");
        System.out.println("Voltage: " + this.voltage + "V");
    }
    public Bulb(String brand, long lifetimeHours, double voltage, short wattage) {
        this("Syska", 5000L, 240.0, (short) 10, true);
        this.brand = brand;
        this.lifetimeHours = lifetimeHours;
        this.voltage = voltage;
        this.wattage = wattage;
        System.out.println("4-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Lifetime: " + this.lifetimeHours + " hours");
        System.out.println("Voltage: " + this.voltage + "V");
        System.out.println("Wattage: " + this.wattage + "W");
    }
    public Bulb(String brand, long lifetimeHours, double voltage, short wattage, boolean isLED) {
        this.brand = brand;
        this.lifetimeHours = lifetimeHours;
        this.voltage = voltage;
        this.wattage = wattage;
        this.isLED = isLED;
        System.out.println("5-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Lifetime: " + this.lifetimeHours + " hours");
        System.out.println("Voltage: " + this.voltage + "V");
        System.out.println("Wattage: " + this.wattage + "W");
        System.out.println("LED: " + this.isLED);
    }
}