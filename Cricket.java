class Cricket extends Sports {
    @Override
    public void play() {
        System.out.println("Playing cricket on the field...");
    }

    @Override
    public void score() {
        System.out.println("Batsman hits a century...");
    }
}