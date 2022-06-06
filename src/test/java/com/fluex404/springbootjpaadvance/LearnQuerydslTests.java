package com.fluex404.springbootjpaadvance;

import com.fluex404.springbootjpaadvance.entity.QCustomer;
import com.fluex404.springbootjpaadvance.repository.CustomerRepository;
import com.querydsl.core.types.dsl.BooleanExpression;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

@SpringBootTest
public class LearnQuerydslTests {

    private final CustomerRepository customerRepository;
    private final EntityManager entityManager;
    public QCustomer qCustomer = QCustomer.customer;

    @Autowired
    public LearnQuerydslTests(CustomerRepository customerRepository, EntityManager entityManager) {
        this.customerRepository = customerRepository;
        this.entityManager = entityManager;
    }

    @Test
    void test(){
        System.out.println("=> JPA <=");

        customerRepository.findAll().forEach(customer -> {
            System.out.println(customer.getId()+" : "+customer.getFirstName()+" "+customer.getLastName());
        });
    }

    @Test
    void testQuerydsl(){
        System.out.println("=> JPA QUERYDSL <=");

        BooleanExpression filter = qCustomer.storeId.eq(2)
                .and(qCustomer.active.eq(0));

        customerRepository.findAll(filter).forEach(customer -> {
            System.out.println(customer.getId()+" : "+customer.getFirstName()+" "+customer.getLastName());
        });
    }
}
