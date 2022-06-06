package com.fluex404.springbootjpaadvance.repository;

import com.fluex404.springbootjpaadvance.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface CustomerRepository extends JpaRepository<Customer, Integer>, JpaSpecificationExecutor<Customer>, QuerydslPredicateExecutor<Customer> {
}