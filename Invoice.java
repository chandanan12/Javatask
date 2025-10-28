class Invoice {
    public Invoice() {
        this(4520.75);
        System.out.println("Invoice created successfully.");
    }

    public Invoice(double amount) {
        this("Customer123", "Online");
        System.out.println("Invoice amount: " + amount);
    }

    public Invoice(String name, String mode) {
        System.out.println("Customer Name: " + name + ", Payment Mode: " + mode);
    }
}

