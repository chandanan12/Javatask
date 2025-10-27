class Manager extends Employe {
    @Override
    public void work() {
        System.out.println("Manager is supervising the team...");
    }

    @Override
    public void submitReport() {
        System.out.println("Manager submits performance report...");
	}
		
	public void login(){
		System.out.println("Employe logs in.. to office");
    }
}