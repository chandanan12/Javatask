class Run{
	public static void main(String[] args) {
        System.out.println("Creating Fan using args constructor:");
        Fan f1 = new Fan("Havells", 5, 75.0, true, 'H');

        System.out.println("Creating Fan using 2-args constructor:");
        Fan f2 = new Fan("Bajaj", 3);
		
		 System.out.println("Creating RoyalClub using 5-args constructor:");
        RoyalClub rc1 = new RoyalClub("Diamond Club", (byte)3, (short)150, 2000000L, 2500.0f, true);

        System.out.println("Creating RoyalClub and calling  constructor:");
        RoyalClub rc2 = new RoyalClub("Silver Club", (byte)2);
		
		System.out.println("Creating Bulb using 2-args constructor:");
        Bulb b1 = new Bulb("Philips", 4000L, 230.0, (short) 12, true);

        System.out.println("calling constructor:");
        Bulb b2 = new Bulb("Syska", 3500L);
		
		System.out.println(" Pencil constructor ");
        Pencil p1 = new Pencil("Staedtler", 18, 15.5f, true, 'B');

        System.out.println("Printing values");
        Pencil p2 = new Pencil("Nataraj", 12);
		
		 System.out.println("House args constructor");
        House h1 = new House("Bangalore", 2, true, 75.5f);

        System.out.println("just printing values");
        House h2 = new House("Chennai", 3);
    }
}
