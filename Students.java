class Students extends Person {
    public void study() {
        System.out.println("Student is studying.");
    }
    public void writeExam() {
        System.out.println("Student is writing exam.");
    }

    public static void main(String[] args) {
        Person p = new Students(); 
        p.walk();
        p.talk();

        Students s = (Students)p; 
        s.study();
        s.writeExam();

        System.out.println(s instanceof Person);
        if (p instanceof Students) {
            Students stu = (Students)p;
            stu.study();
            stu.writeExam();
        } else {
            System.out.println("Not a Student");
        }
    }
}