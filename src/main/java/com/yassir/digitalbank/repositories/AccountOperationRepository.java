package com.yassir.digitalbank.repositories;

import com.yassir.digitalbank.entities.AccountOperation;
import com.yassir.digitalbank.entities.BankAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {

    public List<AccountOperation> findByBankAccountId(String AccountId);
    Page<AccountOperation> findByBankAccountIdOrderByOperationDateDesc(String accountId, Pageable pageable);
}
