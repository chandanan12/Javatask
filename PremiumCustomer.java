class PremiumCustomer extends Customer {
    public void accessOffers() {
        System.out.println("Accessing premium offers");
    }

    public void getPrioritySupport() {
        System.out.println("Getting priority customer support");
    }

    public static void main(String[] args) {
        Customer c = new PremiumCustomer();
        c.login();
        c.logout();

        PremiumCustomer pc = (PremiumCustomer)c;
        pc.accessOffers();
        pc.getPrioritySupport();

        System.out.println(pc instanceof PremiumCustomer);
    }
}