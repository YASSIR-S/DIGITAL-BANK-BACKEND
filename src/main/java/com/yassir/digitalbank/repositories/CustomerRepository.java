package com.yassir.digitalbank.repositories;

import com.yassir.digitalbank.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
