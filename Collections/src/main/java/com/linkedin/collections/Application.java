package com.linkedin.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);
        Room oxfordDuplicate = new Room("Oxford", "Suite", 5, 225.0);
        Room victoria = new Room("Victoria", "Suite", 5, 225.00);
        Room hill = new Room("Hill", "Suite", 6, 500.00);

        Set<Room> anotherRooms = Set.of(piccadilly, oxford);
       // anotherRooms.add(victoria); // UnsupportedOperationException

        Set<Room> rooms = new LinkedHashSet<>();
        rooms.add(piccadilly);
        rooms.add(oxford);
        rooms.add(oxfordDuplicate);
        rooms.add(victoria);
        rooms.add(hill);

        rooms.stream()
                .map(room -> room.getName())
                .forEach(System.out::println);

        System.out.println("---------------------");

        Set<Room> moreRooms = Set.copyOf(rooms);
        moreRooms.stream()
                .map(room -> room.getName())
                .forEach(System.out::println);
    }
}
