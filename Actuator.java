class Actuator {
    String type;
    short power;
    double efficiency;
    boolean isEnabled;
    char condition;

    public Actuator(String type, short power, double efficiency, boolean isEnabled, char condition) {
        this.type = type;
        this.power = power;
        this.efficiency = efficiency;
        this.isEnabled = isEnabled;
        this.condition = condition;
    }
}