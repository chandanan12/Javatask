class MovieTheatre {
    String movieName;
    int totalSeats;
    boolean isRunning;
    float ticketPrice = 250.5f;
    byte screenNumber = 3;

    public MovieTheatre() {
        System.out.println("MovieTheatre created");
    }

    public MovieTheatre(String movieName) {
        System.out.println("Now Showing: " + movieName);
    }

    public MovieTheatre(int totalSeats, boolean isRunning) {
        System.out.println("Total Seats: " + totalSeats + "  Is Running: " + isRunning);
    }

    public static void main(String[] args) {
        MovieTheatre mt = new MovieTheatre();
        MovieTheatre mt1 = new MovieTheatre("Avatar 2");
        MovieTheatre mt2 = new MovieTheatre(250, true);
        System.out.println("Ticket Price: " + mt2.ticketPrice);
        System.out.println("Screen Number: " + mt2.screenNumber);
    }
}