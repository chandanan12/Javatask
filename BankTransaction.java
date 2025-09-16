class BankTransaction {

    public static void initiateTransaction() {
        System.out.println("Transaction initiated");
        verifyAccount();
    }

    public static void verifyAccount() {
        System.out.println("Account verified");
        checkBalance();
    }

    public static void checkBalance() {
        System.out.println("Balance checked");
        debitAmount();
    }

    public static void debitAmount() {
        System.out.println("Amount debited");
        confirmTransaction();
    }

    public static void confirmTransaction() {
        System.out.println("Transaction confirmed");
    }

    public static void main(String[] args) {
        BankTransaction.initiateTransaction();
    }
}
