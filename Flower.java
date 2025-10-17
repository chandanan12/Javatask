class Flower extends Plant {
    @Override
    public void bloom() {
        System.out.println("Flower blooming beautifully...");
    }

    @Override
    public void grow() {
        System.out.println("Flower plant growing in sunlight...");
	}
		
	public void color(){
		System.out.println("color of flower");
    }
}