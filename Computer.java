class Computer {
    String processor;
    int ramGB;
    double price;
    boolean hasGraphicsCard;
    char performanceGrade;

    public Computer(String processor, int ramGB, double price, boolean hasGraphicsCard, char performanceGrade) {
        this.processor = processor;
        this.ramGB = ramGB;
        this.price = price;
        this.hasGraphicsCard = hasGraphicsCard;
        this.performanceGrade = performanceGrade;
    }
}