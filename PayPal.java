class PayPal {
    public static void sendMoney(long transactionId) {
   System.out.println("Sending money with Transaction ID: " + transactionId);
    }
    public static void sendMoney(String recipient, long transactionId) {
   System.out.println("Sending money to: " + recipient + "  Transaction ID: " + transactionId);
    }
    public static String sendMoney(String reason, int price) {
   System.out.println("Transaction failed due to: " + reason + "  price: " + price);
    return reason;
    }
   public static void main(String args[]) {
   sendMoney(1122334455l);
  sendMoney("John Doe", 5566778899l);
  sendMoney("Insufficient Balance",10000);
    }
}