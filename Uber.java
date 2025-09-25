class Uber 
{
    public static void bookRide(long rideId) {
   System.out.println("Booking Uber ride with ID: " + rideId);
    }
    public static void bookRide(String pickupLocation, long rideId) {
  System.out.println("Pickup Location: " + pickupLocation + "  Ride ID: " + rideId);
    }
    public static String bookRide(String reason, String status) {
   System.out.println("Ride delayed due to: " + reason + "  Current status: " + status);
   return reason;
    }
    public static void main(String args[]) {
  bookRide(11223344555l);
   bookRide("Airport", 9988776655l);
  bookRide("Heavy Traffic", "Waiting for driver");
    }
}