class SecurityCamera extends Camera {
    public void recordVideo() {
        System.out.println("Recording video footage.");
    }
    public void detectMotion() {
        System.out.println("Motion detected by camera.");
    }

    public static void main(String[] args) {
        Camera c = new SecurityCamera(); 
        c.turnOn();
        c.turnOff();

        SecurityCamera sc = (SecurityCamera)c; 
        sc.recordVideo();
        sc.detectMotion();

        System.out.println(sc instanceof Camera);
        if (c instanceof SecurityCamera) {
            SecurityCamera cam = (SecurityCamera)c;
            cam.recordVideo();
            cam.detectMotion();
        } else {
            System.out.println("Not a SecurityCamera");
        }
    }
}