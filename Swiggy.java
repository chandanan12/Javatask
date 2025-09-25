class Swiggy 
{
    public static String placeOrder(String restaurant, String item) {
        System.out.println("Placing order for " + item + " from " + restaurant);
        return "Order Confirmed";
    }
    public static void placeOrder(int amount, float discount) {
        System.out.println("Total Amount: ₹" + amount + "  Discount Applied: " + discount + "%");
    }
    public static void placeOrder(int orderId, boolean isPacked) {
        System.out.println("Order ID: " + orderId + "  Is order packed? " + isPacked);
    }
    public static void main(String[] args) {
        String result = placeOrder("KFC", "Zinger Burger");
        System.out.println("Status: " + result);
        placeOrder(799, 10.5f);
        placeOrder(1023, false);
    }
}