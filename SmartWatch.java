class SmartWatch {
    String brand;
    int price;
    String features;
    float rating;

    public SmartWatch() {
        this("Noise", 4000);
        this.brand = brand;
        System.out.println("It is a No-args constructor");
    }

    public SmartWatch(String brand) {
        this("Apple", 45000, "Health Tracking", 4.9f);
        this.brand = brand;
        System.out.println("It is a 1-arg constructor");
        System.out.println("Brand: " + this.brand);
    }

    public SmartWatch(String brand, int price) {
        this.brand = brand;
        this.price = price;
        System.out.println("It is a 2-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
    }

    public SmartWatch(String brand, int price, String features) {
        this("Boat");
        this.brand = brand;
        this.price = price;
        this.features = features;
        System.out.println("It is a 3-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Features: " + this.features);
    }

    public SmartWatch(String brand, int price, String features, float rating) {
        this();
        this.brand = brand;
        this.price = price;
        this.features = features;
        this.rating = rating;
        System.out.println("It is a 4-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Features: " + this.features);
        System.out.println("Rating: " + this.rating);
    }
}