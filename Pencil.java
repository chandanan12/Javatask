class Pencil {

    String brand;
    int length;     
    float price;    
    boolean isMechanical;
    char colorCode;  

    public Pencil() {
        this("Unknown", 10, 5.0f, false, 'B');
        System.out.println("No-args constructor called");
    }
    public Pencil(String brand) {
        this("Cello", 15);
        this.brand = brand;
        System.out.println("1-arg constructor called");
        System.out.println("Brand: " + this.brand);
    }
    public Pencil(String brand, int length) {
        this("Faber-Castell", 12, 7.5f);
        this.brand = brand;
        this.length = length;
        System.out.println("2-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Length: " + this.length + " cm");
    }
    public Pencil(String brand, int length, float price) {
        this();
        this.brand = brand;
        this.length = length;
        this.price = price;
        System.out.println("3-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Length: " + this.length + " cm");
        System.out.println("Price: ₹" + this.price);
    }
    public Pencil(String brand, int length, float price, boolean isMechanical) {
        this("Camlin", 10, 6.0f, false, 'H');
        this.brand = brand;
        this.length = length;
        this.price = price;
        this.isMechanical = isMechanical;
        System.out.println("4-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Length: " + this.length + " cm");
        System.out.println("Price: ₹" + this.price);
        System.out.println("Mechanical: " + this.isMechanical);
    }
    public Pencil(String brand, int length, float price, boolean isMechanical, char colorCode) {
        this.brand = brand;
        this.length = length;
        this.price = price;
        this.isMechanical = isMechanical;
        this.colorCode = colorCode;
        System.out.println("5-args constructor called");
        System.out.println("Brand: " + this.brand);
        System.out.println("Length: " + this.length + " cm");
        System.out.println("Price: ₹" + this.price);
        System.out.println("Mechanical: " + this.isMechanical);
        System.out.println("Color Code: " + this.colorCode);
    }
}