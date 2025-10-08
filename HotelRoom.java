class HotelRoom {
    String roomType;
    int roomNumber;
    boolean isOccupied;
    float roomPrice = 450.75f;
    byte floor = 5;

    public HotelRoom() {
        System.out.println("HotelRoom created");
    }

    public HotelRoom(String roomType) {
        System.out.println("Room Type: " + roomType);
    }

    public HotelRoom(int roomNumber, boolean isOccupied) {
        System.out.println("Room Number: " + roomNumber + "  Is Occupied: " + isOccupied);
    }

    public static void main(String[] args) {
        HotelRoom hr = new HotelRoom();
        HotelRoom hr1 = new HotelRoom("Deluxe Suite");
        HotelRoom hr2 = new HotelRoom(505, false);
        System.out.println("Room Price: ₹" + hr2.roomPrice);
        System.out.println("Floor: " + hr2.floor);
    }
}