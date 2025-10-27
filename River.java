class River extends Nature {
    public void flow() {
        System.out.println("River is flowing...");
    }

    public static void main(String[] args) {
        Nature nt = new Mountain();
        nt.showBeauty();
        Mountain m = (Mountain)nt;
        m.climb();

        Nature mo = new River();
        mo.showBeauty();
        River r = (River)mo;
        r.flow();

        System.out.println(r instanceof Nature);
    }
}