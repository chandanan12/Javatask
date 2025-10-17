class ColorPrinter extends LaserPrinter {
    public void printColor() {
        System.out.println("Printing in color...");
    }
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
		
        Printer ref = new LaserPrinter();
        ref.print();

        LaserPrinter lp = new LaserPrinter();
        lp.print();
        lp.cleanNozzle();

        ColorPrinter cp = new ColorPrinter();
        cp.print();
        cp.cleanNozzle();
        cp.printColor();

        LaserPrinter lpRef = cp;
        lpRef.cleanNozzle();
        lpRef.print();
    }
}