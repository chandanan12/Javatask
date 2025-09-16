class BagProduct {
    public static void main(String[] args) {
        byte[] productIds = {51, 52, 53};
        short[] stockCounts = {150, 250, 300};
        int[] prices = {899, 1999, 3499};
        long[] barcodes = {112211221122L, 998899889988L, 776677667766L};
        float[] ratings = {3.8f, 4.3f, 4.7f};
        double[] discounts = {5.5, 12.0, 18.5};
        char[] models = {'X', 'Y', 'Z'};
        boolean[] availability = {true, true, false};
        String[] productNames = {"Skybags", "American Tourister", "Wildcraft"};
        
        System.out.println("Bag Products:");
        for (String name : productNames) {
            System.out.println(name);
        }
    }
}