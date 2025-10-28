class Crop extends Farmer {
    public Crop() {
        super();
        System.out.println("Crop details have been saved.");
    }

    public static void main(String[] args) {
        Crop c = new Crop();
    }
}