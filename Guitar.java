class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing guitar chords...");
    }

    @Override
    public void testSound() {
        System.out.println("Checking sound on amplifier...");
    }
}