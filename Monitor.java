class Monitor {
    String name;
    long serialNumber;
    float screenSize;
    boolean isWorking;
    byte rating;

    public Monitor(String name, long serialNumber, 
	float screenSize, boolean isWorking, byte rating) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.screenSize = screenSize;
        this.isWorking = isWorking;
        this.rating = rating;
    }
}