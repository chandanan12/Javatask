class Tablet {
    String brand;
    int price;
    String model;
    float rating;

    public Tablet() {
        this("Samsung", 25000, "Galaxy Tab S8", 4.6f);
        System.out.println("It is a No-args constructor");
    }

    public Tablet(String brand) {
        this("Apple", 85000);
        this.brand = brand;
        System.out.println("It is a 1-arg constructor");
        System.out.println("Brand: " + this.brand);
    }

    public Tablet(String brand, int price) {
        this("Lenovo", 32000, "Tab M10");
        this.brand = brand;
        this.price = price;
        System.out.println("It is a 2-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
    }

    public Tablet(String brand, int price, String model) {
        this();
        this.brand = brand;
        this.price = price;
        this.model = model;
        System.out.println("It is a 3-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Model: " + this.model);
    }

    public Tablet(String brand, int price, String model, float rating) {
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.rating = rating;
        System.out.println("It is a 4-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Model: " + this.model);
        System.out.println("Rating: " + this.rating);
    }
}
