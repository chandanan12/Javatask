class RoyalClub {
    String clubName;
    byte floorNumber;        
    short membersCount;      
    long revenue;           
    float monthlyFee;        
    boolean hasGym;          
	
    public RoyalClub() {
        this("Unknown Club", (byte)1, (short)50, 500000L, 1000.0f, false);
        System.out.println("No-args constructor called");
 }
    public RoyalClub(String clubName) {
        this("Elite Club", (byte)2);
        this.clubName = clubName;
        System.out.println("1-arg constructor called");
        System.out.println("Club Name: " + this.clubName);
    }
    public RoyalClub(String clubName, byte floorNumber) {
        this("Premium Club", (byte)3, (short)100);
        this.clubName = clubName;
        this.floorNumber = floorNumber;
        System.out.println("2-args constructor called");
        System.out.println("Club Name: " + this.clubName);
        System.out.println("Floor Number: " + this.floorNumber);
    }
    public RoyalClub(String clubName, byte floorNumber, short membersCount) {
        this();
        this.clubName = clubName;
        this.floorNumber = floorNumber;
        this.membersCount = membersCount;
        System.out.println("3-args constructor called");
        System.out.println("Club Name: " + this.clubName);
        System.out.println("Floor Number: " + this.floorNumber);
        System.out.println("Members Count: " + this.membersCount);
    }
    public RoyalClub(String clubName, byte floorNumber, short membersCount, long revenue) {
        this("Royal Elite", (byte)5, (short)200, 1000000L, 2000.0f, true);
        this.clubName = clubName;
        this.floorNumber = floorNumber;
        this.membersCount = membersCount;
        this.revenue = revenue;
        System.out.println("4-args constructor called");
        System.out.println("Club Name: " + this.clubName);
        System.out.println("Floor Number: " + this.floorNumber);
        System.out.println("Members Count: " + this.membersCount);
        System.out.println("Revenue: ₹" + this.revenue);
    }
    public RoyalClub(String clubName, byte floorNumber, short membersCount, long revenue, float monthlyFee, boolean hasGym) {
        this.clubName = clubName;
        this.floorNumber = floorNumber;
        this.membersCount = membersCount;
        this.revenue = revenue;
        this.monthlyFee = monthlyFee;
        this.hasGym = hasGym;
        System.out.println("5-args constructor called");
        System.out.println("Club Name: " + this.clubName);
        System.out.println("Floor Number: " + this.floorNumber);
        System.out.println("Members Count: " + this.membersCount);
        System.out.println("Revenue: ₹" + this.revenue);
        System.out.println("Monthly Fee: ₹" + this.monthlyFee);
        System.out.println("Has Gym: " + this.hasGym);
    }
}