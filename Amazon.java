class Amazon 
{
    public static void placeOrder(long orderId) {
  System.out.println("Placing order with ID: " + orderId);
    }
    public static void placeOrder(String productName, long orderId) {
    System.out.println("Product: " + productName + "  Order ID: " + orderId);
    }
    public static String placeOrder(String reason, String status) {
  System.out.println("Order delayed due to: " + reason + "  Status: " + status);
  return reason;
    }
    public static void main(String args[]) {
  placeOrder(1001223344l);
 placeOrder("Laptop", 5566778899l);
 placeOrder("Payment Issue", "Pending confirmation");
    }
}