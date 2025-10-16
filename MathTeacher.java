class MathTeacher extends Teacher {
    @Override
    public void teach() {
        System.out.println("Teaching mathematics formulas...");
    }

    @Override
    public void giveHomework() {
        System.out.println("Homework: Solve 10 algebra problems...");
    }
}