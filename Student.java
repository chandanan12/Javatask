class Student extends College {
    public void attendClass() {
        System.out.println("Student attending class...");
    }

    public static void main(String[] args) {
        College c = new Professor();
        c.openCollege();
        Professor p = (Professor)c;
        p.takeLecture();

        College cp = new Student();
        cp.openCollege();
        Student s = (Student)cp;
        s.attendClass();

        System.out.println(p instanceof College);
    }
}