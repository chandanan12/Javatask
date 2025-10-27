class ActionMovie extends Movie {
    @Override
    public void playScene() {
        System.out.println("Playing thrilling action scene...");
    }

    @Override
    public void rateMovie() {
        System.out.println("Action movie rated 9/10...");
	}
		
	public void time(){
	    System.out.println("movie showing time should mention");
    }
}