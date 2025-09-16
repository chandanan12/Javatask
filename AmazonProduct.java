class AmazonProduct {
    public static void main(String[] args) {
        
        byte[] productIds = {1, 2, 3};
        short[] stockCounts = {150, 300, 450};
        int[] prices = {499, 1299, 2599, 7999};
        long[] barcodes = {9876543210L, 1234567890L, 1122334455L};
        float[] productRatings = {4.5f, 3.8f, 4.9f};
        double[] productDiscounts = {10.25, 20.50, 15.75};
        char[] sizes = {'S', 'M', 'L', 'X'};
        boolean[] availability = {true, false, true};
		
        String[] productNames = {"Shoes", "Watch", "Laptop", "Bag"};

        System.out.println("Product IDs (byte):");
        for (byte id : productIds) {
            System.out.println(id);
        }

        System.out.println("\nStock Counts (short):");
        for (short stock : stockCounts) {
            System.out.println(stock);
        }

        System.out.println("\nPrices (int):");
        for (int price : prices) {
            System.out.println(price);
        }

        System.out.println("\nBarcodes (long):");
        for (long code : barcodes) {
            System.out.println(code);
        }

        System.out.println("\nRatings (float):");
        for (float rating : productRatings) {
            System.out.println(rating);
        }

        System.out.println("\nDiscounts (double):");
        for (double discount : productDiscounts) {
            System.out.println(discount);
        }

        System.out.println("\nSizes (char):");
        for (char size : sizes) {
            System.out.println(size);
        }

        System.out.println("\nAvailability (boolean):");
        for (boolean available : availability) {
            System.out.println(available);
        }

        System.out.println("\nProduct Names (String):");
        for (String name : productNames) {
            System.out.println(name);
        }
    }
}