package com.greatlearning.skyscraper;

import java.util.Scanner;
import java.util.Stack;

public class BuildingConstruction {

	Scanner scanner = new Scanner(System.in);
	int totalNoOfFloors;
	int[] buildingArray;

	public void addBuilding() {

		System.out.println("Enter the total number of floors in the building");
		totalNoOfFloors = scanner.nextInt();
		buildingArray = new int[totalNoOfFloors];

		for (int i = 0; i < totalNoOfFloors; i++) {
			System.out.println("Enter the floor size given on day " + (i + 1));
			buildingArray[i] = scanner.nextInt();
		}
		scanner.close();
	}

	public void constructBuilding() {

		Stack<Integer> building = new Stack<Integer>();
		int length = buildingArray.length;

		for (int i = 0; i < buildingArray.length; i++) {
			System.out.println("Day " + (i + 1));
			building.add(buildingArray[i]);

			while (!building.isEmpty() && building.peek() == length) {
				System.out.print(building.pop() + " ");
				length--;
			}
			System.out.println();
		}
	}

}
