class Farmer {
    public Farmer() {
        this("Ramesh");
        System.out.println("Farmer registered successfully.");
    }

    public Farmer(String name) {
        this("Sugarcane", 15.5);
        System.out.println("Farmer Name: " + name);
    }

    public Farmer(String crop, double landArea) {
        System.out.println("Crop: " + crop + ", Land Area: " + landArea + " acres");
    }
}

