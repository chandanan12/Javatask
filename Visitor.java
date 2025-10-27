class Visitor extends Garden {
    public void enjoyScenery() {
        System.out.println("Visitor enjoying the garden view.");
    }

    public static void main(String[] args) {
        Garden gd = new Gardener();
        gd.waterPlants();
        Gardener gr = (Gardener)gd;
        gr.trimPlants();

        Garden vi = new Visitor();
        vi.waterPlants();
        Visitor v = (Visitor)vi;
        v.enjoyScenery();

        System.out.println(gr instanceof Garden);
    }
}