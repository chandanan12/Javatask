class SchoolLibrary {
    String sectionName;
    int numberOfBooks;
    boolean isOpen;
    float finePerDay = 2.5f;
    byte floorNumber = 1;

    public SchoolLibrary() {
        System.out.println("SchoolLibrary created");
    }

    public SchoolLibrary(String sectionName) {
        System.out.println("Library Section: " + sectionName);
    }

    public SchoolLibrary(int numberOfBooks, boolean isOpen) {
        System.out.println("Total Books: " + numberOfBooks + "  Is Open: " + isOpen);
    }

    public static void main(String[] args) {
        SchoolLibrary sl = new SchoolLibrary();
        SchoolLibrary sl1 = new SchoolLibrary("Science Section");
        SchoolLibrary sl2 = new SchoolLibrary(1200, true);
        System.out.println("Fine per day: ₹" + sl2.finePerDay);
        System.out.println("Floor Number: " + sl2.floorNumber);
    }
}