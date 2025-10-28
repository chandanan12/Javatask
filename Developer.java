class Developer extends Company {
    public void writeCode() {
        System.out.println("Developer is writing Java code.");
    }

    public static void main(String[] args) {            
        Company ch = new HR();
        ch.openOffice();
        HR h = (HR)ch;
        h.conductInterview();

        Company cd = new Developer();
        cd.openOffice();
        Developer d = (Developer)cd;
        d.writeCode();

        System.out.println(h instanceof Company);
    }
}