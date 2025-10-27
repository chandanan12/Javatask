class Waiter extends Restaurant {
    public void serveFood() {
        System.out.println("Waiter is serving food.");
    }

    public static void main(String[] args) {
        Restaurant r = new Chef();
        r.openRestaurant();
        Chef c = (Chef)r;
        c.cookFood();

        Restaurant rw = new Waiter();
        rw.openRestaurant();
        Waiter w = (Waiter)rw;
        w.serveFood();

        System.out.println(c instanceof Restaurant);
    }
}