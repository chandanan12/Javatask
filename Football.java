class Football extends OutdoorSports {
    public void goal() {
        System.out.println("Goal scored in football!");
    }

    public static void main(String[] args) {
        System.out.println("===== Super Class =====");
        Sports s = new Sports();
        s.play();

        System.out.println("===== Upcasting Example =====");
        Sports sp = new OutdoorSports();
        sp.play();

        System.out.println("===== Subclass =====");
        OutdoorSports os = new OutdoorSports();
        os.play();
        os.warmUp();

        System.out.println("===== Multilevel =====");
        Football f = new Football();
        f.play();
        f.warmUp();
        f.goal();

        System.out.println("===== Upcasting =====");
        OutdoorSports ref = f;
        ref.play();
        ref.warmUp();
    }
}