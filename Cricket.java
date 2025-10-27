class Cricket extends Sports1 {
    @Override
    public void play() {
        System.out.println("Playing cricket on the field...");
    }

    @Override
    public void score() {
        System.out.println("Batsman hits a century...");
	}
		
	public void match(){
		System.out.println("played matches of cricket");
    }
}