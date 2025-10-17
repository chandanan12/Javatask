class Song extends Music {
    @Override
    public void record() {
        System.out.println("Recording vocals for the song...");
    }

    @Override
    public void publish() {
        System.out.println("Publishing single on Spotify...");
	}
	
	public void volume(){
	    System.out.println("changing volume in songs");
    }
}