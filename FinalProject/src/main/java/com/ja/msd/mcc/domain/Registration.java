package com.ja.msd.mcc.domain;

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
	String customerId;
	
	@Column(name="EVENTID")
	String eventId;
	
	@Column(name="EVENTDATE")
	Date eventDate;
	
	@Column(name="NOTES")
	String notes;
	
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	public Registration(long id, String customerId, String eventId, Date eventDate, String notes) {
		super();
		this.id=id;
		this.customerId = customerId;
		this.eventId = eventId;
		this.eventDate = eventDate;
		this.notes = notes;
	}
	
	public String toJSON() {
		return "{\"id\"" + ":" + customerId + ", \"name\"" + ": \""+ "\", \"eventId\"" + eventId + ": \"" + eventId + "\", \"eventDate\"" + ": \"" + eventDate + "\" }";
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
}
