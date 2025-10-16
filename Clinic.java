class Clinic extends Hospital {
    @Override
    public void admitPatient() {
        System.out.println("Admitting patient for basic checkup...");
    }

    @Override
    public void maintainRecords() {
        System.out.println("Maintaining outpatient records...");
    }
}