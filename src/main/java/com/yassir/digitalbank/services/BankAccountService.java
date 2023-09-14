package com.yassir.digitalbank.services;

import com.yassir.digitalbank.dtos.*;
import com.yassir.digitalbank.entities.BankAccount;
import com.yassir.digitalbank.entities.CurrentAccount;
import com.yassir.digitalbank.entities.Customer;
import com.yassir.digitalbank.entities.SavingAccount;
import com.yassir.digitalbank.exceptions.BalanceNotSufficient;
import com.yassir.digitalbank.exceptions.BankAccountNotFoundException;
import com.yassir.digitalbank.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficient;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BalanceNotSufficient, BankAccountNotFoundException;


    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long CustomerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    List<AccountOperationDTO> accountHistory(String accountId);

    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFoundException;
    List<CustomerDTO> searchCustomers(String keyword);

}
