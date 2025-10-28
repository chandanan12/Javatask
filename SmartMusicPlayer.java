class SmartMusicPlayer extends MusicPlayer {
    public void connectBluetooth() {
        System.out.println("Connected to Bluetooth speaker");
    }

    public void recordAudio() {
        System.out.println("Recording live audio");
    }

    public static void main(String[] args) {
        MusicPlayer mp = new SmartMusicPlayer();
        mp.play();
        mp.stop();

        SmartMusicPlayer smp = (SmartMusicPlayer)mp;
        smp.connectBluetooth();
        smp.recordAudio();

        System.out.println(smp instanceof SmartMusicPlayer);
    }
}