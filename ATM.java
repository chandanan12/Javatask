class ATM extends Bank {
    @Override
    public void withdraw() {
        System.out.println("Withdrawing cash from ATM...");
    }

    @Override
    public void checkBalance() {
        System.out.println("Displaying balance on ATM screen...");
    }
}