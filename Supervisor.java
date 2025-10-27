class Supervisor extends Factory {
    public void checkQuality() {
        System.out.println("Supervisor checking product quality.");
    }

    public static void main(String[] args) {
        Factory f = new Worker();
        f.startMachine();
        Worker w = (Worker)f;
        w.operateMachine();

        Factory ft = new Supervisor();
        ft.startMachine();
        Supervisor s = (Supervisor)ft;
        s.checkQuality();

        System.out.println(w instanceof Factory);
    }
}