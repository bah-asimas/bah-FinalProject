package com.ja.msd.mcc.domain;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REGISTRATIONS")
public class Registration {

	long id;
	String name;
	long eventId;
	String eventName;
	Timestamp eventDate;
	
	public Registration(long id, String name, long eventId, String eventName, Timestamp eventDate) {
		super();
		this.id = id;
		this.name = name;
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDate = eventDate;
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
	
	public Timestamp getEventDate() {
		return eventDate;
	}

	public void setEventDate(Timestamp eventDate) {
		this.eventDate = eventDate;
	}
}
