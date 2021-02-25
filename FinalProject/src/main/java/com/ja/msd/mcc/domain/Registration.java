package com.ja.msd.mcc.domain;

public class Registration {

	long id;
	String name;
	long eventId;
	String eventName;
	
	public Registration(long id, String name, long eventId, String eventName) {
		super();
		this.id = id;
		this.name = name;
		this.eventId = eventId;
		this.eventName = eventName;
	}
	
	public String toJSON() {
		return "{\"id\"" + ":" + id + ", \"name\"" + ": \"" + name + "\", \"eventId\"" + ": \"" + eventId + "\", \"eventName\"" + ": \"" + eventName + "\" }";
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
}
