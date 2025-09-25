class  GoogleMaps
{
    public static void navigate(long locationId) {
System.out.println("Navigating to location ID: " + locationId);
    }
    public static void navigate(String locationName, long locationId) {
   System.out.println("Navigating to: " + locationName + "  Location ID: " + locationId);
    }
    public static String navigate(String reason, String status) {
   System.out.println("Cannot navigate due to: " + reason + "  Status: " + status);
    return reason;
    }
 public static void main(String args[]) {
  navigate(100200300l);
navigate("Central Park", 400500600l);
  navigate("No GPS Signal", "Retrying");
    }
}