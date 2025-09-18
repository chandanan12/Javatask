class Bike
{
    static byte warranty;
    static short weight;
    static int engineCC;
    static long price;
    static double mileage;
    static String model;
    static char fuelType;
    static float topSpeed;
    static boolean isABS;
    public static byte warranty(){
        warranty = 2;   
        return warranty;
    }
    public static short weight(){
        weight = 160; 
        return weight;
    }
    public static int engineCC(){
        engineCC = 155; 
        return engineCC;
    }
    public static long price(){
        price = 165000L; 
        return price;
    }
    public static double mileage(){
        mileage = 45.5; 
        return mileage;
    }
    public static String model(){
        model = "Yamaha R15 V4"; 
        return model;
    }
    public static char fuelType(){
        fuelType = 'P'; 
        return fuelType;
    }
    public static float topSpeed(){
        topSpeed = 140.5f; 
        return topSpeed;
    }
    public static boolean isABS(){
        isABS = true;
        return isABS;
    }
    public static void workProcess(){
        System.out.println("This is Bike Details.");
    }
    public static void main(String[] args){
        System.out.println("=== Bike ===");
        System.out.println("Warranty : " + warranty() + " years");
        System.out.println("Weight : " + weight() + " kg");
        System.out.println("Engine CC : " + engineCC());
        System.out.println("Price : ₹" + price());
        System.out.println("Mileage : " + mileage() + " km/l");
        System.out.println("Model : " + model());
        System.out.println("Fuel Type : " + fuelType());
        System.out.println("Top Speed : " + topSpeed() + " km/h");
        System.out.println("ABS Available : " + isABS());
        workProcess();
    }
}