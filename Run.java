class Run{
	public static void main(String[] args) {
        Fan f1 = new Fan("Havells", 5, 75.0, true, 'H');
        Fan f2 = new Fan("Bajaj", 3);
        RoyalClub rc1 = new RoyalClub("Diamond Club", (byte)3, (short)150, 2000000L, 2500.0f, true);
        RoyalClub rc2 = new RoyalClub("Silver Club", (byte)2);
        Bulb b1 = new Bulb("Philips", 4000L, 230.0, (short) 12, true);
        Bulb b2 = new Bulb("Syska", 3500L);
        Pencil p1 = new Pencil("Staedtler", 18, 15.5f, true, 'B');
        Pencil p2 = new Pencil("Nataraj", 12);
        House h1 = new House("Bangalore", 2, true, 75.5f);
        House h2 = new House("Chennai", 3);
    }
}