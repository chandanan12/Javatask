class TeslaCar
{
    public static byte warranty(){
        return 5;  
    }
    public static short weight(){
        return 2200; 
    }
    public static int batteryCapacity(){
        return 100; 
    }
    public static long price(){
        return 6500000L; 
    }
    public static float topSpeed(){
        return 250.5f; 
    }
    public static double mileage(){
        return 600.75; 
    }
    public static char modelCode(){
        return 'S'; 
    }
    public static boolean isAutopilot(){
        return true; 
    }
    public static String modelName(){
        return "Tesla Model S Plaid";
    }
    public static void information(){
        System.out.println("This is Tesla Car Details.");
    }
    public static void main(String[] args){
        byte w = warranty();
        short wt = weight();
        int battery = batteryCapacity();
        long cost = price();
        float speed = topSpeed();
        double range = mileage();
        char code = modelCode();
        boolean auto = isAutopilot();
        String name = modelName();
		
        System.out.println("=== Tesla Car ===");
        System.out.println("Warranty : " + w + " years");
        System.out.println("Weight : " + wt + " kg");
        System.out.println("Battery Capacity : " + battery + " kWh");
        System.out.println("Price : ₹" + cost);
        System.out.println("Top Speed : " + speed + " km/h");
        System.out.println("Mileage : " + range + " km/charge");
        System.out.println("Model Code : " + code);
        System.out.println("Autopilot : " + auto);
        System.out.println("Model Name : " + name);
        information();
    }
}