package com.linkedin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Application {

    public static void main(String[] args) {

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.00);
        Room westminister = new Room("Westminister", "Premiere Room", 4, 200.00);

        Collection<Room> rooms = new ArrayList<>(Arrays.asList(piccadilly, cambridge, westminister));

        Iterator<Room> iterator = rooms.iterator();
        Iterator<Room> iterator2 = rooms.iterator();
        Iterator<Room> iterator3 = rooms.iterator();
        Iterator<Room> iterator4 = rooms.iterator();

        System.out.println(iterator.next().getName());
        System.out.println(iterator.next().getName());
        System.out.println(iterator2.next().getName());
        System.out.println("---------------");

        while (iterator3.hasNext()) {
            Room room = iterator3.next();
            System.out.println(room.getName());
        }
        System.out.println("---------------");

        for (Room room : rooms) {
            System.out.println(room.getName());
        }
        System.out.println("---------------");

    }
}
