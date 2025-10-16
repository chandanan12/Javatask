class House {
    String location;
    int floors;
    boolean hasGarage;
    float price;  
	
    public House() {
        this("Unknown", 1, false, 50.0f);
        System.out.println("No-args constructor called");
    }
    public House(String location) {
        this("Delhi", 2);
        this.location = location;
        System.out.println("1-arg constructor called");
        System.out.println("Location: " + this.location);
    }
    public House(String location, int floors) {
        this("Mumbai", 3, true);
        this.location = location;
        this.floors = floors;
        System.out.println("2-args constructor called");
        System.out.println("Location: " + this.location);
        System.out.println("Floors: " + this.floors);
    }
    public House(String location, int floors, boolean hasGarage) {
        this();
        this.location = location;
        this.floors = floors;
        this.hasGarage = hasGarage;
        System.out.println("3-args constructor called");
        System.out.println("Location: " + this.location);
        System.out.println("Floors: " + this.floors);
        System.out.println("Has Garage: " + this.hasGarage);
    }
    public House(String location, int floors, boolean hasGarage, float price) {
        this.location = location;
        this.floors = floors;
        this.hasGarage = hasGarage;
        this.price = price;
        System.out.println("4-args constructor called");
        System.out.println("Location: " + this.location);
        System.out.println("Floors: " + this.floors);
        System.out.println("Has Garage: " + this.hasGarage);
        System.out.println("Price: ₹" + this.price + " lakhs");
    }
}