class CarShowroom {
    String carModel;
    int carPrice;
    boolean isAvailable;
    float discount = 5.5f;
    byte showroomNumber = 7;

    public CarShowroom() {
        System.out.println("CarShowroom created");
    }

    public CarShowroom(String carModel) {
        System.out.println("Car Model: " + carModel);
    }

    public CarShowroom(int carPrice, boolean isAvailable) {
        System.out.println("Car Price: ₹" + carPrice + " Available: " + isAvailable);
    }

    public static void main(String[] args) {
        CarShowroom cs = new CarShowroom();
        CarShowroom cs1 = new CarShowroom("Tata Nexon EV");
        CarShowroom cs2 = new CarShowroom(1500000, true);
        System.out.println("Discount: " + cs2.discount + "%");
        System.out.println("Showroom Number: " + cs2.showroomNumber);
    }
}