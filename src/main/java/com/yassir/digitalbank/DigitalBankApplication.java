package com.yassir.digitalbank;


import com.yassir.digitalbank.entities.Customer;
import com.yassir.digitalbank.repositories.AccountOperationRepository;
import com.yassir.digitalbank.repositories.BankAccountRepository;
import com.yassir.digitalbank.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DigitalBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalBankApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BankAccountRepository bankAccountRepository
                                      , CustomerRepository customerRepository,
                                        AccountOperationRepository accountOperationRepository) {
        return args -> {
            Stream.of("Hassan", "Imane", "Mohamed").forEach(name -> {
                Customer customer = new Customer();
                customer.setName(name);
                customer.setEmail(name + "@gmail.com");
                customerRepository.save(customer);
            });

        };
    }}