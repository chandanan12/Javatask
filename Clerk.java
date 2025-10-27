class Clerk extends Staff {
    public void manageRecords() {
        System.out.println("Clerk managing student records.");
    }

    public static void main(String[] args) {
        Staff st = new Principal();
        st.enterCampus();
        Principal p = (Principal)st;
        p.conductMeeting();

        Staff sp = new Clerk();
        sp.enterCampus();
        Clerk c = (Clerk)sp;
        c.manageRecords();

        System.out.println(p instanceof Staff);
    }
}