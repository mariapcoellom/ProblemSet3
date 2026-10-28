package edu.monmouth.problemSet3;

import edu.monmouth.campusvehicle.Color;

import edu.monmouth.campusvehicle.CampusVehicle;


public class ProblemSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CampusVehicle automobile1 = new CampusVehicle();
		System.out.println("ID: " + automobile1.getId());
		System.out.println("Location: " + automobile1.getLocation());
		System.out.println("Available: " + automobile1.isAvailable());
		System.out.println("Color: " + automobile1.getColor());
		
		automobile1.setId("MU1555");
		automobile1.setLocation("Library");
		automobile1.setAvailable(false);
		automobile1.setColor(Color.BLUE);
		

	}

}
