package edu.monmouth.problemSet1;

import edu.monmouth.campusvehicle.CampusVehicle;

public class ProblemSet1 {
		 	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CampusVehicle automobile1 = new CampusVehicle("A001", "Library", true);
		
		CampusVehicle automobile2 = new CampusVehicle();
		CampusVehicle automobile3 = new CampusVehicle();
		CampusVehicle automobile4 = new CampusVehicle();
		CampusVehicle automobile5 = new CampusVehicle();
		// print current attributes
		System.out.println(automobile1.getId());
		System.out.println(automobile1.getLocation());
		System.out.println(automobile1.isAvailable());
		
		System.out.println(automobile2.getId());
		System.out.println(automobile2.getLocation());
		System.out.println(automobile2.isAvailable());
		
		System.out.println(automobile3.getId());
		System.out.println(automobile3.getLocation());
		System.out.println(automobile3.isAvailable());
		
		System.out.println(automobile4.getId());
		System.out.println(automobile4.getLocation());
		System.out.println(automobile4.isAvailable());
		
		System.out.println(automobile5.getId());
		System.out.println(automobile5.getLocation());
		System.out.println(automobile5.isAvailable());
		
		// set/change attributes
		automobile2.setId("GT002");
		automobile2.setLocation("Parson Cafe");
		automobile2.setAvailable(false);
		
		automobile3.setId("MG030");
		automobile3.setLocation("Maplewood Hall");
		automobile3.setAvailable(true);
		
		automobile4.setId("SRT04");
		automobile4.setLocation("Fitness Center");
		automobile4.setAvailable(false);
		
		automobile5.setId("RAwR1");
		automobile5.setLocation("Graduate Center");
		automobile5.setAvailable(true);
		
		System.out.println(automobile2.getId());
		System.out.println(automobile2.getLocation());
		System.out.println(automobile2.isAvailable());
		
		System.out.println(automobile3.getId());
		System.out.println(automobile3.getLocation());
		System.out.println(automobile3.isAvailable());
		
		System.out.println(automobile4.getId());
		System.out.println(automobile4.getLocation());
		System.out.println(automobile4.isAvailable());
		
		System.out.println(automobile5.getId());
		System.out.println(automobile5.getLocation());
		System.out.println(automobile5.isAvailable());
		
		

	}

}
