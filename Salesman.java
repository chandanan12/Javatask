class Salesman extends Shop {
    public void showProduct() {
        System.out.println("Salesman showing products to customer.");
    }

    public static void main(String[] args) {
        Shop s = new Cashier();
        s.openShop();
        Cashier c = (Cashier)s;
        c.billCustomer();

        Shop sc = new Salesman();
        sc.openShop();
        Salesman sm = (Salesman)sc;
        sm.showProduct();

        System.out.println(c instanceof Shop);
    }
}