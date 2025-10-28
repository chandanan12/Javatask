class Software {
    public Software() {
        this(3.5f);
        System.out.println("Software installation started.");
    }

    public Software(float version) {
        this("Unity Engine", true);
        System.out.println("Software version: " + version);
    }

    public Software(String engine, boolean licensed) {
        System.out.println("Engine used: " + engine + ", Licensed: " + licensed);
    }
}

