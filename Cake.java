class Cake extends Foods {
    public Cake() {
        super();
        System.out.println("Cake is ready for delivery.");
    }

    public static void main(String[] args) {
        Cake c = new Cake();
    }
}