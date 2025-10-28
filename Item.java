class Item {
    public Item() {
        this(850);
        System.out.println("Item is being processed for shipping.");
    }

    public Item(int price) {
        this("Travel Bag", 2.5f);
        System.out.println("Item price: " + price);
    }

    public Item(String name, float weight) {
        System.out.println("Item name: " + name + ", Weight: " + weight + " kg");
    }
}

