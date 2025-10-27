class DigitalLibrary extends Library {
    @Override
    public void issueBook() {
        System.out.println("Issuing eBook to user...");
    }

    @Override
    public void returnBook() {
        System.out.println("Returning eBook online...");
	}
	public void bookNumber(){
	    System.out.println("book number should be present");
    }
}