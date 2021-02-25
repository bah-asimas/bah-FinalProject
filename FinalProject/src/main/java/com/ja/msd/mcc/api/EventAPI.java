package com.ja.msd.mcc.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ja.msd.mcc.domain.Customer;
import com.ja.msd.mcc.domain.Event;

public class EventAPI {

		List<Event> eventList = new ArrayList<Event>();
		
		public EventAPI()
		{
			Event e1 = new Event(1L, "Event1", "The Bean", "Free");
			Event e2 = new Event(2L, "Event2", "Beanzz", "Free");
			eventList.add(e1);
			eventList.add(e2);
		}
		
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
		
		
}
