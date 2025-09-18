class LGTV
{
    public static byte warranty(){
        byte years = 3;   
        return years;
    }
    public static short weight(){
        short wt = 12000;  
        return wt;
    }
    public static int screenSize(){
        int size = 65;    
        return size;
    }
    public static long price(){
        long cost = 125000L; 
        return cost;
    }
    public static double resolution(){
        double pixels = 7680.432;  
        return pixels;
    }
    public static String model(){
        String name = "LG OLED Evo"; 
        return name;
    }
    public static char energyRating(){
        char rating = 'A';   
        return rating;
    }
    public static float thickness(){
        float t = 2.1f; 
        return t;
    }
    public static boolean isSmartTV(){
        boolean smart = true;  
        return smart;
    }
    public static void details(){
        String msg = "This is LG TV Details.";
        System.out.println(msg);
    }
    public static void main(String[] args){
        System.out.println("=== LG TV ===");
        System.out.println("Warranty : " + warranty() + " years");
        System.out.println("Weight : " + weight() + " g");
        System.out.println("Screen Size : " + screenSize() + " inches");
        System.out.println("Price : ₹" + price());
        System.out.println("Resolution : " + resolution() + " pixels");
        System.out.println("Model : " + model());
        System.out.println("Energy Rating : " + energyRating());
        System.out.println("Thickness : " + thickness() + " cm");
        System.out.println("Smart TV : " + isSmartTV());
        details();
    }
}