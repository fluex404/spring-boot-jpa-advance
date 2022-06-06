package com.fluex404.springbootjpaadvance;

import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;

@SpringBootApplication
public class SpringBootJpaAdvanceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaAdvanceApplication.class, args);
	}

	@Autowired
	private EntityManager entityManager;

//	public static QCustomer cu

	@Override
	public void run(String... args) throws Exception {
//		var customer = QCustomer.customer;
//		var query = new JPAQuery(entityManager);

	}
}
