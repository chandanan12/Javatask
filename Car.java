class Car extends Vehicle {
    @Override
    public void wash() {
        System.out.println("Washing the car with shampoo...");
    }

    @Override
    public void testDrive() {
        System.out.println("Testing car speed and handling...");
	}
		
	public void color(){
		System.out.println("color of car");
    }
}