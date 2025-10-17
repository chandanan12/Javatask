class Chair extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling chair parts...");
    }

    @Override
    public void testDurability() {
        System.out.println("Testing chair weight capacity...");
    }
}