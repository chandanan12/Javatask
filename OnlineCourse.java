class OnlineCourse extends Course {
    public OnlineCourse() {
        super();
        System.out.println("Online course registration completed.");
    }

    public static void main(String[] args) {
        OnlineCourse oc = new OnlineCourse();
    }
}