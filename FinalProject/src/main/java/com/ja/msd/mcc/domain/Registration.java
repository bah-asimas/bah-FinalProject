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

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	@Column(name="CUSTOMERID")
	long customerId;
	
	@Column(name="EVENTID")
	long eventId;
	
	@Column(name="EVENTNAME")
	String eventName;
	
	@Column(name="EVENTDATE")
	Timestamp eventDate;
	
	@Column(name="NOTES")
	String notes;
	
	public Registration(long id, long customerId, long eventId, String eventName, Timestamp eventDate, String notes) {
		super();
		this.id=id;
		this.customerId = customerId;
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.notes = notes;
	}
	
	public String toJSON() {
		return "{\"id\"" + ":" + customerId + ", \"name\"" + ": \"" + eventName + "\", \"eventId\"" + eventId + ": \"" + eventId + "\", \"eventDate\"" + ": \"" + eventDate + "\" }";
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
