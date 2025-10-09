class Controller {
    String model;
    int version;
    double responseTime;
    byte value;
    char statusCode;

    public Controller(String model, int version, double responseTime, byte value, char statusCode) {
        this.model = model;
        this.version = version;
        this.responseTime = responseTime;
        this.value = value;
        this.statusCode = statusCode;
    }
}