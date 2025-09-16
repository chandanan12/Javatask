class Hospital {
    static int wardNo = 7;
    static String hospitalName = "City Care Hospital";
    static long contactNo = 9876543210L;
    static boolean isOpen = true;
    static char grade = 'A';

    public static void Doctor() {
        int doctorId = 101;
        String doctorName = "Dr. Meena";
        String specialization = "Cardiologist";

        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital Grade: " + grade);
    }

    public static void Patient() {
        int patientId = 202;
        String patientName = "Rahul";
        double billAmount = 12500.75;
        byte daysAdmitted = 5;

        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Bill Amount: " + billAmount);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Ward Number: " + wardNo);
    }

    public static void main(String[] args) {
        Doctor();
        Patient();
        System.out.println("Hospital Contact Number: " + contactNo);
        System.out.println("Is Hospital Open? " + isOpen);
		Library.bookDetails();
		Library.issueDetails();
		
    }
}