class Product {
    public Product() {
        this(1200.50);
        System.out.println("Product is available in the store.");
    }

    public Product(double price) {
        this("Wireless Earbuds", true);
        System.out.println("Product price: " + price);
    }

    public Product(String name, boolean inStock) {
        System.out.println("Product name: " + name + ", Available: " + inStock);
    }
}
