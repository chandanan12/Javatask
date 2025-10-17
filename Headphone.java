class Headphone {

    String brand;
    int price;
    String type;
    float rating;

    public Headphone() {
        this("Sony", 3000);
        this.brand = brand;
        System.out.println("It is a No-args constructor");
    }

    public Headphone(String brand) {
        this("Bose", 15000, "Over-Ear", 4.9f);
        this.brand = brand;
        System.out.println("It is a 1-arg constructor");
        System.out.println("Brand: " + this.brand);
    }

    public Headphone(String brand, int price) {
        this.brand = brand;
        this.price = price;
        System.out.println("It is a 2-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
    }

    public Headphone(String brand, int price, String type) {
        this("JBL");
        this.brand = brand;
        this.price = price;
        this.type = type;
        System.out.println("It is a 3-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Type: " + this.type);
    }

    public Headphone(String brand, int price, String type, float rating) {
        this();
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.rating = rating;
        System.out.println("It is a 4-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Type: " + this.type);
        System.out.println("Rating: " + this.rating);
    }
}