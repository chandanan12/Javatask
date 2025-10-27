class Elephant extends Zoo {
    public void eatGrass() {
        System.out.println("Elephant is eating grass...");
    }

    public static void main(String[] args) {
        Zoo z = new Lion();
        z.openZoo();
        Lion l = (Lion)z;
        l.roar();

        Zoo zo = new Elephant();
        zo.openZoo();
        Elephant e = (Elephant)zo;
        e.eatGrass();

        System.out.println(l instanceof Zoo);
    }
}