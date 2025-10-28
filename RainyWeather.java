class RainyWeather extends Weather {
    public void startRain() {
        System.out.println("It has started raining.");
    }
    public void stopRain() {
        System.out.println("Rain has stopped.");
    }

    public static void main(String[] args) {
        Weather w = new RainyWeather(); 
        w.displayTemp();
        w.showHumidity();

        RainyWeather r = (RainyWeather)w; 
        r.startRain();
        r.stopRain();

        System.out.println(r instanceof Weather);
        if (w instanceof RainyWeather) {
            RainyWeather rainy = (RainyWeather)w;
            rainy.startRain();
            rainy.stopRain();
        } else {
            System.out.println("Not RainyWeather");
        }
    }
}