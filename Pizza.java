class Pizza extends Food {
    @Override
    public void serve() {
        System.out.println("Serving pizza hot with cheese...");
    }

    @Override
    public void taste() {
        System.out.println("Pizza tastes cheesy and spicy...");
	}
		
	public void shape(){
		System.out.println("shape  of pizza");
    }
}