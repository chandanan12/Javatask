class Flipkart 
{
    public static void searchProduct(String productName) {
        System.out.println("Searching for product: " + productName);
    }
    public static void searchProduct(String category, double price) {
        if(category.equals("Electronics") && price > 50000) {
            System.out.println("Premium Electronics found: " + category + " at ₹" + price);
        } else if(category.equals("Clothing") && price < 1000) {
            System.out.println("Affordable clothing available at ₹" + price);
        } else {
            System.out.println("Category: " + category + "  Price: ₹" + price);
        }
    }
    public static boolean searchProduct(boolean isAvailable, float rating) {
        System.out.println("Product available: " + isAvailable + "  Rating: " + rating + "★");
        return isAvailable;
    }
    public static void main(String[] args) {
        // Call overloaded methods
        searchProduct("iPhone 15");
        searchProduct("Electronics", 75000);
        searchProduct(true, 4.5f);
    }
}