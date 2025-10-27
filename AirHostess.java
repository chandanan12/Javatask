class AirHostess extends Airline {
    public void servePassengers() {
        System.out.println("Airhostess serving passengers.");
    }

    public static void main(String[] args) {
        Airline a = new Pilot();
        a.startService();
        Pilot p = (Pilot)a;
        p.flyPlane();

        Airline ai = new AirHostess();
        ai.startService();
        AirHostess h = (AirHostess)ai;
        h.servePassengers();

        System.out.println(p instanceof Airline);
    }
}