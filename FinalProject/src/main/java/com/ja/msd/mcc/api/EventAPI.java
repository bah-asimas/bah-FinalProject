package com.ja.msd.mcc.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.ja.msd.mcc.domain.Event;
import com.ja.msd.mcc.repository.EventRepository;

public class EventAPI {

		@Autowired
	    EventRepository repo;
		
		
		@GetMapping
		public List<Event> getAll() {

			return eventList;
		}

		public List<Event> getListOfEvents() {
			return this.eventList;
		}
		
		public void setListOfEvents(List<Event> listOfEvents) {
			this.eventList = listOfEvents;
		}
		@GetMapping("/{eventId}")
		public Event getEvent(@PathVariable("eventId") long id) {
			Event response = null;
			for (int i = 0; i < eventList.size(); i++) {
				if (eventList.get(i).getId() == id) {
					response = eventList.get(i);
				}
			}
			return response;
		}
		
		@GetMapping
		public Iterable<Event> getAll() {
			//  Workshop:  Implement a method to retrieve all events
			return null;
		}

		@GetMapping("/{eventId}")
		public Optional<Event> getEventById(@PathVariable("eventId") long id) {
			//  Workshop:  Implement a method to retrieve a single event by it's ID
			Event response = null;
			for (int i = 0; i < eventList.size(); i++) {
				if (eventList.get(i).getId() == id) {
					response = eventList.get(i);
				}
			}
			return response;
		}
		
		@PostMapping
		public ResponseEntity<?> addEvent(@RequestBody Event newEvent, UriComponentsBuilder uri) {
			//  Workshop:  Implement a method to create a new event in response to a POST message.
			//  Think about how you ensure that the event is properly formed.
			return null;
		}

		@PutMapping("/{eventId}")
		public ResponseEntity<?> putEvent(
				@RequestBody Event newEvent,
				@PathVariable("eventId") long eventId) 
		{
			//  Workshop:  Implement a method to update an entitye in response to a PUT message.
			return null;
		}	
		
		@DeleteMapping("/{eventId}")
		public ResponseEntity<?> deleteEventById(@PathVariable("eventId") long id) {
			//  Workshop:  Implement a method to delete an entity. 
			return null;
		}	
		
		
}
