package com.ja.msd.mcc.repository;

import org.springframework.data.repository.CrudRepository;

import com.ja.msd.mcc.domain.Customer;

public interface CustomersRepository extends CrudRepository<Customer, Long> {

}
