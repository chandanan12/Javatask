class HPLaptop extends Computer {
    @Override
    public void runProgram() {
        System.out.println("Running program on battery mode...");
    }

    @Override
    public void connectWifi() {
        System.out.println("HPLaptop connected to wireless hotspot...");
    }
}