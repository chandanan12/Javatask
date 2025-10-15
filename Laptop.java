class Laptop {

    String brand;
    int price;
    String processor;
    float rating;

    public Laptop() {
        this("HP", 55000);
        this.brand = brand;
        System.out.println("It is a No-args constructor");
    }

    public Laptop(String brand) {
        this("Apple", 120000, "M3 Chip", 4.9f);
        this.brand = brand;
        System.out.println("It is a 1-arg constructor");
        System.out.println("Brand: " + this.brand);
    }

    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
        System.out.println("It is a 2-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
    }

    public Laptop(String brand, int price, String processor) {
        this("Dell");
        this.brand = brand;
        this.price = price;
        this.processor = processor;
        System.out.println("It is a 3-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Processor: " + this.processor);
    }

    public Laptop(String brand, int price, String processor, float rating) {
        this();
        this.brand = brand;
        this.price = price;
        this.processor = processor;
        this.rating = rating;
        System.out.println("It is a 4-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Processor: " + this.processor);
        System.out.println("Rating: " + this.rating);
    }
}