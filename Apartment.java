class Apartment{
    String apartmentName;
    int totalFlats;
    boolean hasLift;
    float maintenanceCost = 2500.0f;
    byte blockNumber = 4;

    public Apartment() {
        System.out.println("Apartment created");
    }

    public Apartment(String apartmentName) {
        System.out.println("Apartment Name: " + apartmentName);
    }

    public Apartment(int totalFlats, boolean hasLift) {
        System.out.println("Total Flats: " + totalFlats + "  Has Lift: " + hasLift);
    }

    public static void main(String[] args) {
        Apartment ap = new Apartment();
        Apartment ap1 = new Apartment("Green View Residency");
        Apartment ap2 = new Apartment(80, true);
        System.out.println("Maintenance Cost: ₹" + ap2.maintenanceCost);
        System.out.println("Block Number: " + ap2.blockNumber);
    }
}