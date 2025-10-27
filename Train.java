class Train extends Transport {
    public void stopAtStation() {
        System.out.println("Train stopped at station.");
    }

    public static void main(String[] args) {
        Transport t = new Bus();
        t.move();
        Bus b = (Bus)t;
        b.carryPassengers();

        Transport tt = new Train();
        tt.move();
        Train tr = (Train)tt;
        tr.stopAtStation();

        System.out.println(b instanceof Transport);
    }
}