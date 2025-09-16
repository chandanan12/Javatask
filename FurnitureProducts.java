class FurnitureProducts {
    public static void main(String[] args) {
        int[] ids = {501, 502, 503};
        String[] names = {"Chair", "Table", "Sofa"};
        double[] prices = {1500.00, 3500.50, 12000.00};
        float[] ratings = {4.1f, 4.4f, 4.6f};
        short[] stock = {80, 40, 20};
        byte[] warranty = {2, 3, 5}; // in years
        long[] weight = {7000L, 20000L, 45000L}; // grams
        boolean[] discount = {true, true, false};
        char[] category = {'F', 'F', 'F'}; // F = Furniture

        System.out.println("----- Furniture Products -----");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Product ID (int): " + ids[i]);
            System.out.println("Product Name (String): " + names[i]);
            System.out.println("Price (double): ₹" + prices[i]);
            System.out.println("Rating (float): " + ratings[i]);
            System.out.println("Available Stock (short): " + stock[i]);
            System.out.println("Warranty (byte): " + warranty[i] + " year(s)");
            System.out.println("Weight (long): " + weight[i] + "