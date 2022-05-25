package com.linkedin.collections;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {

		Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
		Room oxford = new Room("Oxford", "Suite", 5, 225.0);

		Guest john = new Guest("John", "Doe", false);
		Guest maria = new Guest("Maria", "Doe", true);

		Map<Room, Guest> assignments = new HashMap<>();
		assignments.put(oxford, maria);
		assignments.put(piccadilly, john);

		System.out.println(assignments.get(new Room("Oxford", "Suite", 5, 225.0)));
		System.out.println(assignments.get(piccadilly));

		// remove return maria's object
		Guest mariaDel = assignments.remove(oxford);

		// put return john object
		Guest guest = assignments.put(piccadilly,  mariaDel);

		// put john in oxford
		assignments.putIfAbsent(oxford, guest);
		System.out.println();
	}
}
