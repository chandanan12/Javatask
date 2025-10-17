class CollegeStudent extends HighSchool {
    public void submitAssignment() {
        System.out.println("Submitting college assignment...");
    }

    public static void main(String[] args) {
        System.out.println("===== Super Class =====");
        Education e = new Education();
        e.startCourse();

        System.out.println("===== Upcasting Example =====");
        Education edu = new HighSchool();
        edu.startCourse();

        System.out.println("===== Subclass =====");
        HighSchool h = new HighSchool();
        h.startCourse();
        h.attendClass();

        System.out.println("===== Multilevel =====");
        CollegeStudent c = new CollegeStudent();
        c.startCourse();
        c.attendClass();
        c.submitAssignment();

        System.out.println("===== Upcasting =====");
        HighSchool ref = c;
        ref.startCourse();
        ref.attendClass();
    }
}