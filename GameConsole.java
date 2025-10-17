class GameConsole {
    String brand;
    int price;
    String type;
    float rating;

    public GameConsole() {
        this("Sony", 50000);
        this.brand = brand;
        System.out.println("It is a No-args constructor");
    }

    public GameConsole(String brand) {
        this("Microsoft", 45000, "Xbox", 4.7f);
        this.brand = brand;
        System.out.println("It is a 1-arg constructor");
        System.out.println("Brand: " + this.brand);
    }

    public GameConsole(String brand, int price) {
        this.brand = brand;
        this.price = price;
        System.out.println("It is a 2-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
    }

    public GameConsole(String brand, int price, String type) {
        this("Nintendo");
        this.brand = brand;
        this.price = price;
        this.type = type;
        System.out.println("It is a 3-args constructor");
        System.out.println("Brand: " + this.brand);
        System.out.println("Price: " + this.price);
        System.out.println("Type: " + this.type);
    }

    public GameConsole(String brand, int price, String type, float rating) {
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