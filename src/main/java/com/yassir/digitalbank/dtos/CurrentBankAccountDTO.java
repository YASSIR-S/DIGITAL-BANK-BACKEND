package com.yassir.digitalbank.dtos;

import com.yassir.digitalbank.entities.AccountOperation;
import com.yassir.digitalbank.entities.Customer;
import com.yassir.digitalbank.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data

public  class CurrentBankAccountDTO extends BankAccountDTO {

private String id;
private double balance;
private Date createdAt;
private AccountStatus status;
private CustomerDTO customerDTO ;
    private double overDraft;

private List<AccountOperation> accountOperations;
}
