class Fan {
    String brand;
    int blades;
    double powerConsumption; 
    boolean hasRemote;
    char speedLevel; 
	
    public Fan() {
        this("Unknown", 3, 50.0, false, 'M');
        System.out.println("No-args constructor called");
    }
    public Fan(String brand) {
        this("Orient", 3);
        this.brand = brand;
        System.out.println("1-arg constructor called");
        System.out.println("Brand: " + this.brand);
    }
    public Fan(String brand, int blades) {
        this("Usha", 4, 60.0);
        this.brand = brand;
        this.blades = blades;
        System.out.println("2-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Blades: " + this.blades);
    }
    public Fan(String brand, int blades, double powerConsumption) {
        this();
        this.brand = brand;
        this.blades = blades;
        this.powerConsumption = powerConsumption;
        System.out.println("3-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Blades: " + this.blades);
        System.out.println("Power Consumption: " + this.powerConsumption + "W");
    }
    public Fan(String brand, int blades, double powerConsumption, boolean hasRemote) {
        this("Crompton", 3, 55.0, false, 'L');
        this.brand = brand;
        this.blades = blades;
        this.powerConsumption = powerConsumption;
        this.hasRemote = hasRemote;
        System.out.println("4-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Blades: " + this.blades);
        System.out.println("Power Consumption: " + this.powerConsumption + "W");
        System.out.println("Has Remote: " + this.hasRemote);
    }
    public Fan(String brand, int blades, double powerConsumption, boolean hasRemote, char speedLevel) {
        this.brand = brand;
        this.blades = blades;
        this.powerConsumption = powerConsumption;
        this.hasRemote = hasRemote;
        this.speedLevel = speedLevel;
        System.out.println("5-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Blades: " + this.blades);
        System.out.println("Power Consumption: " + this.powerConsumption + "W");
        System.out.println("Has Remote: " + this.hasRemote);
        System.out.println("Speed Level: " + this.speedLevel);
    }
}