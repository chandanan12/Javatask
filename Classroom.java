class Classroom extends School {
    public void conductClass() {
        System.out.println("Classroom is conducting a session.");
    }
    public void takeAttendance() {
        System.out.println("Attendance is being taken.");
    }

    public static void main(String[] args) {
        School s = new Classroom();
        s.open();
        s.close();

        Classroom c = (Classroom)s; 
        c.conductClass();
        c.takeAttendance();

        System.out.println(c instanceof School);
        if (s instanceof Classroom) {
            Classroom cls = (Classroom)s;
            cls.conductClass();
            cls.takeAttendance();
        } else {
            System.out.println("Not a Classroom");
        }
    }
}