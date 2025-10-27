class Ethernet extends Network {
    public void sendPacket() {
        System.out.println("Ethernet sending packet.");
    }

    public static void main(String[] args) {
        Network na = new WiFi();
        na.connect();
        WiFi w = (WiFi)na;
        w.transmitData();

        Network nae = new Ethernet();
        nae.connect();
        Ethernet e = (Ethernet)nae;
        e.sendPacket();

        System.out.println(w instanceof Network);
    }
}