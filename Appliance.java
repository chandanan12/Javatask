class Appliance {
    String name;
    int powerWatts;
    double price;
    boolean isSmart;
    char energyRating;

    public Appliance(String name, int powerWatts, double price, boolean isSmart, char energyRating) {
        this.name = name;
        this.powerWatts = powerWatts;
        this.price = price;
        this.isSmart = isSmart;
        this.energyRating = energyRating;
    }
}