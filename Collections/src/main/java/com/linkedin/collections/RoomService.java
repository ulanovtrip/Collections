package com.linkedin.collections;

import java.util.*;

public class RoomService {

    private Collection<Room> inventory;

    public RoomService() {
       // this.inventory = new HashSet<>();
        this.inventory = new LinkedHashSet<>();
    }

    public boolean hasRoom(Room room) {

        // 1. Returns a boolean that indicates if the Room Inventory contains a Room.
        return this.inventory.contains(room);
    }

    public Room[] asArray() {

        // 2. Returns all Rooms as an Array of Rooms in the **order** they were Added.
//        Room[] array = new Room[inventory.size()];
//        List<Room> list = new ArrayList<>(inventory);
//        int j = inventory.size() - 1;
//        for (int i = 0; i < inventory.size(); i++, j--) {
//            array[i] = list.get(j);
//        }
//        return array;

        return inventory.toArray(new Room[0]);
    }

    public Collection<Room> getByType(String type) {

	/*
	   3. Return a new Collection of Rooms where Room#type matches the provided String.
		  The original Room Inventory collection MUST NOT BE MODIFIED.
	*/
//        Collection<Room> typedCollection = new ArrayList<>();
//        List<Room> list = new ArrayList<>(inventory);
//        for(int i = 0; i < inventory.size(); i++) {
//            Room current = list.get(i);
//            if(current.getType().equals("Premiere Room")) {
//                typedCollection.add(current);
//            }
//        }
//        return typedCollection;
        Collection<Room> copy = new HashSet<>(this.inventory);
        copy.removeIf(element -> !element.getType().equals(type));
        return copy;
    }

    public Collection<Room> getInventory() {
        return new HashSet<>(this.inventory);
    }

    public void createRoom(String name, String type, int capacity, double price) {
        this.inventory.add(new Room(name, type, capacity, price));
    }

    public void createRooms(Room[] rooms) {
        this.inventory.addAll(Arrays.asList(rooms));
    }

    public void removeRoom(Room room) {
        this.inventory.remove(room);
    }

}
