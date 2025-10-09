class Runner {
    public static void main(String args[]) {
		
	    Computer c1 = new Computer("Intel i7", 16, 85000.00, true, 'A');
        System.out.println("Processor : " + c1.processor + " RAM : " + c1.ramGB + "GB price : " + c1.price + " graphics : " + c1.hasGraphicsCard + " performance : " + c1.performanceGrade);
       
	   Computer c2 = new Computer("AMD Ryzen 5", 8, 55000.50, true, 'B');
        System.out.println("Processor : " + c2.processor + " RAM : " + c2.ramGB + "GB price : " + c2.price + " graphics : " + c2.hasGraphicsCard + " performance : " + c2.performanceGrade);
       
	   Computer c3 = new Computer("Intel i3", 4, 35000.25, false, 'C');
        System.out.println("Processor : " + c3.processor + " RAM : " + c3.ramGB + "GB price : " + c3.price + " graphics : " + c3.hasGraphicsCard + " performance : " + c3.performanceGrade);
       
	   System.out.println("=========================================");
       
	   Actuator actuator1 = new Actuator("Hydraulic", (short) 150, 0.85, true, 'G');
        System.out.println("The Actuator Type is : " + actuator1.type + " its power : " + actuator1.power + " efficiency : " + actuator1.efficiency + " isenabled : " + actuator1.isEnabled + " their condition : " + actuator1.condition);

        Actuator actuator2 = new Actuator("Pneumatic", (short) 120, 0.75, false, 'F');
        System.out.println("The Actuator Type is : " + actuator2.type + " its power : " + actuator2.power + " efficiency : " + actuator2.efficiency + " isenabled : " + actuator2.isEnabled + " their condition : " + actuator2.condition);

        Actuator actuator3 = new Actuator("Electric", (short) 200, 0.95, true, 'E');
        System.out.println("The Actuator Type is : " + actuator3.type + " its power : " + actuator3.power + " efficiency : " + actuator3.efficiency + " isenabled : " + actuator3.isEnabled + " their condition : " + actuator3.condition);

        System.out.println("=========================================");

        Controller controller1 = new Controller("X100", 1, 0.5, (byte) 10, 'A');
        System.out.println("Model is : " + controller1.model + " The model version are : " + controller1.version + " Where it will response in : " + controller1.responseTime + " It's value : " + controller1.value + " having a code : " + controller1.statusCode);

        Controller controller2 = new Controller("X200", 2, 0.6, (byte) 20, 'B');
        System.out.println("Model is : " + controller2.model + " The model version are : " + controller2.version + " Where it will response in : " + controller2.responseTime + " It's value : " + controller2.value + " having a code : " + controller2.statusCode);

        Controller controller3 = new Controller("X300", 3, 0.4, (byte) 30, 'C');
        System.out.println("Model is : " + controller3.model + " The model version are : " + controller3.version + " Where it will response in : " + controller3.responseTime + " It's value : " + controller3.value + " having a code : " + controller3.statusCode);

        System.out.println("=========================================");

        Monitor monitor1 = new Monitor("Dell", 123456789L, 27.5f, true, (byte) 5);
        System.out.println("Name : " + monitor1.name + " and the item is placed in : " + monitor1.serialNumber + " Where having a size : " + monitor1.screenSize + " is isworking : " + monitor1.isWorking + " And the having a best ratings: " + monitor1.rating);

        Monitor monitor2 = new Monitor("Samsung", 987654321L, 24.0f, false, (byte) 4);
        System.out.println("Name : " + monitor2.name + " and the item is placed in : " + monitor2.serialNumber + " Where having a size : " + monitor2.screenSize + " is isworking : " + monitor2.isWorking + " And the having a best ratings: " + monitor2.rating);

        Monitor monitor3 = new Monitor("LG", 112233445L, 32.0f, true, (byte) 3);
        System.out.println("Name : " + monitor3.name + " and the item is placed in : " + monitor3.serialNumber + " Where having a size : " + monitor3.screenSize + " is isworking : " + monitor3.isWorking + " And the having a best ratings: " + monitor3.rating);
        
		System.out.println("=========================================");
        
		Building b1 = new Building("SkyTower", 50, 220.5, true, 'C');
        System.out.println("Building name : " + b1.name + " floors : " + b1.floors + " height : " + b1.height + " has lift : " + b1.hasLift + " category : " + b1.category);
        
		Building b2 = new Building("GreenHeights", 20, 95.8, true, 'R');
        System.out.println("Building name : " + b2.name + " floors : " + b2.floors + " height : " + b2.height + " has lift : " + b2.hasLift + " category : " + b2.category);
        
		Building b3 = new Building("CityMall", 10, 45.2, false, 'M');
        System.out.println("Building name : " + b3.name + " floors : " + b3.floors + " height : " + b3.height + " has lift : " + b3.hasLift + " category : " + b3.category);
    }
}
		