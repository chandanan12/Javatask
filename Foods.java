class Foods {
    public Foods() {
        this("Vanilla");
        System.out.println("Foods order placed.");
    }

    public Foods(String flavor) {
        this("Chocolate Cake", 500.25);
        System.out.println("Selected flavor: " + flavor);
    }

    public Foods(String name, double price) {
        System.out.println("Foods item: " + name + ", Price: " + price);
    }
}
