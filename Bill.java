class Bill extends Invoice {
    public Bill() {
        super();
        System.out.println("Bill has been generated.");
    }

    public static void main(String[] args) {
        Bill bill = new Bill();
    }
}