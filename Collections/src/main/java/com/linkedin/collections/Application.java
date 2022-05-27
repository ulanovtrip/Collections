package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxford1 = new Room("Oxford", "Guest Room", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.0);

        List<Room> rooms = new ArrayList<>(List.of(piccadilly, oxford1, cambridge, victoria, oxford));
        // sorting
        rooms.sort(Room.RATE_COMPARATOR);

        // need sorted list
        int index = Collections.binarySearch(rooms, victoria, Room.RATE_COMPARATOR);
        System.out.println("index = " + index);

        // new object
        Room newLondon = new Room("NewLondon", "Suite", 7, 300.0);

        // return negative
        int index2 = Collections.binarySearch(rooms, newLondon, Room.RATE_COMPARATOR);
        System.out.println("index2 = " + index2);

        // add newLondon in list
        rooms.add(Math.abs(++index), newLondon);

        // find minimum and max by rate
        System.out.println("Minimum = " + Collections.min(rooms, Room.RATE_COMPARATOR).getName());
        System.out.println("Maximum = " + Collections.max(rooms, Room.RATE_COMPARATOR).getName());

        System.out.format("%n%n--List Contents--%n");
        rooms.stream()
                .forEach(r -> System.out.format("%-15s %-15s %-10f %n", r.getName(), r.getType(), r.getRate()));
    }
}
