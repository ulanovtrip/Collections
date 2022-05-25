package com.linkedin.collections;

import java.util.Objects;

public class RoomWithBadKey {

	private String name;

	private String type;

	private int capacity;

	private double rate;
	
	private boolean petFriendly;

	public RoomWithBadKey(String name, String type, int capacity, double rate) {
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public boolean isPetFriendly() {
		return petFriendly;
	}

	public void setPetFriendly(boolean petFriendly) {
		this.petFriendly = petFriendly;
	}

	// this necessary for correct work with collection
//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//		RoomWithBadKey that = (RoomWithBadKey) o;
//		return capacity == that.capacity && Double.compare(that.rate, rate) == 0 && petFriendly == that.petFriendly && name.equals(that.name) && type.equals(that.type);
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, type, capacity, rate, petFriendly);
//	}
}
