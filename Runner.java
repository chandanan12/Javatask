class Runner {
    public static void main(String args[]) {
	
        Appliance a1 = new Appliance("Refrigerator", 500, 35000.50, true, 'A');
        System.out.println("Appliance name : " + a1.name + " power : " + a1.powerWatts + "W price : " + a1.price + " smart : " + a1.isSmart + " energy rating : " + a1.energyRating);
        Appliance a2 = new Appliance("Microwave", 900, 12000.00, false, 'B');
        System.out.println("Appliance name : " + a2.name + " power : " + a2.powerWatts + "W price : " + a2.price + " smart : " + a2.isSmart + " energy rating : " + a2.energyRating);
        Appliance a3 = new Appliance("Washing Machine", 750, 25000.99, true, 'A');
        System.out.println("Appliance name : " + a3.name + " power : " + a3.powerWatts + "W price : " + a3.price + " smart : " + a3.isSmart + " energy rating : " + a3.energyRating);
        
		System.out.println("=========================================");

        Vehicle v1 = new Vehicle("Tesla", 2024, 450.5, true, 'E');
        System.out.println("Vehicle brand : " + v1.brand + " model year : " + v1.modelYear + " mileage : " + v1.mileage + " electric : " + v1.isElectric + " fuel type : " + v1.fuelType);
        Vehicle v2 = new Vehicle("Toyota", 2022, 18.5, false, 'P');
        System.out.println("Vehicle brand : " + v2.brand + " model year : " + v2.modelYear + " mileage : " + v2.mileage + " electric : " + v2.isElectric + " fuel type : " + v2.fuelType);
        Vehicle v3 = new Vehicle("Honda", 2023, 22.8, false, 'D');
        System.out.println("Vehicle brand : " + v3.brand + " model year : " + v3.modelYear + " mileage : " + v3.mileage + " electric : " + v3.isElectric + " fuel type : " + v3.fuelType);
        
		System.out.println("=========================================");

        Computer c1 = new Computer("Intel i7", 16, 85000.00, true, 'A');
        System.out.println("Processor : " + c1.processor + " RAM : " + c1.ramGB + "GB price : " + c1.price + " graphics : " + c1.hasGraphicsCard + " performance : " + c1.performanceGrade);
        Computer c2 = new Computer("AMD Ryzen 5", 8, 55000.50, true, 'B');
        System.out.println("Processor : " + c2.processor + " RAM : " + c2.ramGB + "GB price : " + c2.price + " graphics : " + c2.hasGraphicsCard + " performance : " + c2.performanceGrade);
        Computer c3 = new Computer("Intel i3", 4, 35000.25, false, 'C');
        System.out.println("Processor : " + c3.processor + " RAM : " + c3.ramGB + "GB price : " + c3.price + " graphics : " + c3.hasGraphicsCard + " performance : " + c3.performanceGrade);
       
	   System.out.println("=========================================");
     
		
        Employee e1 = new Employee("Chandana", 101, 50000.00, true, 'A');
        System.out.println("Employee name : " + e1.name + " ID : " + e1.id + " salary : " + e1.salary + " permanent : " + e1.isPermanent + " grade : " + e1.grade);
        Employee e2 = new Employee("Ravi", 102, 35000.00, false, 'B');
        System.out.println("Employee name : " + e2.name + " ID : " + e2.id + " salary : " + e2.salary + " permanent : " + e2.isPermanent + " grade : " + e2.grade);
        Employee e3 = new Employee("Priya", 103, 60000.00, true, 'A');
        System.out.println("Employee name : " + e3.name + " ID : " + e3.id + " salary : " + e3.salary + " permanent : " + e3.isPermanent + " grade : " + e3.grade);
        
		System.out.println("=========================================");

        Building b1 = new Building("SkyTower", 50, 220.5, true, 'C');
        System.out.println("Building name : " + b1.name + " floors : " + b1.floors + " height : " + b1.height + " has lift : " + b1.hasLift + " category : " + b1.category);
        Building b2 = new Building("GreenHeights", 20, 95.8, true, 'R');
        System.out.println("Building name : " + b2.name + " floors : " + b2.floors + " height : " + b2.height + " has lift : " + b2.hasLift + " category : " + b2.category);
        Building b3 = new Building("CityMall", 10, 45.2, false, 'M');
        System.out.println("Building name : " + b3.name + " floors : " + b3.floors + " height : " + b3.height + " has lift : " + b3.hasLift + " category : " + b3.category);
    }
}