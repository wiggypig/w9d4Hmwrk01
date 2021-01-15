package com.company;

import pets.Pet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int petAge;
        Pet housePet = new Pet("Hobbs", 1, "HouseLion");
        petAge = housePet.getAge();
        System.out.println(petAge);
        System.out.println(housePet.getName());
        System.out.println(housePet.getType());

    }
}
