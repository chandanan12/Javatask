class SmartLight extends Light {
    public void changeColor() {
        System.out.println("Light color changed to blue");
    }

    public void adjustBrightness() {
        System.out.println("Brightness adjusted to 80%");
    }

    public static void main(String[] args) {
        Light l = new SmartLight();
        l.switchOn();
        l.switchOff();

        SmartLight sl = (SmartLight)l;
        sl.changeColor();
        sl.adjustBrightness();

        System.out.println(sl instanceof SmartLight);
    }
}