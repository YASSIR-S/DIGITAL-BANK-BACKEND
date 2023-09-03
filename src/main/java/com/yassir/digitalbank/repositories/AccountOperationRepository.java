package com.yassir.digitalbank.repositories;

import com.yassir.digitalbank.entities.AccountOperation;
import com.yassir.digitalbank.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
    
}
