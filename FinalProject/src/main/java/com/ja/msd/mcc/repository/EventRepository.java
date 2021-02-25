package com.ja.msd.mcc.repository;

import org.springframework.data.repository.CrudRepository;

import com.ja.msd.mcc.domain.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}