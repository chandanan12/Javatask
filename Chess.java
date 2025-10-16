class Chess extends Game {
    @Override
    public void play() {
        System.out.println("Playing chess with strategies...");
    }

    @Override
    public void score() {
        System.out.println("Winning by checkmate...");
    }
}