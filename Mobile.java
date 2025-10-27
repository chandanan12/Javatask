class Mobile extends Device {
    @Override
    public void charge() {
        System.out.println("Charging mobile with fast charger...");
    }

    @Override
    public void update() {
        System.out.println("Updating Android OS...");
	}
		
	public void delete(){
		System.out.println("deleting the the photos");
    }
}