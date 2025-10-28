class Course {
    public Course() {
        this("Java Programming");
        System.out.println("Course platform created.");
    }

    public Course(String courseName) {
        this("Intermediate", 45);
        System.out.println("Course Name: " + courseName);
    }

    public Course(String level, int duration) {
        System.out.println("Course Level: " + level + ", Duration: " + duration + " days");
    }
}

