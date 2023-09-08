package com.yassir.digitalbank.entities;

import com.yassir.digitalbank.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 5)
public abstract class BankAccount {
    @Id
private String id;
private double balance;
private Date createdAt;
private AccountStatus status;
@ManyToOne
private Customer customer;
@OneToMany(mappedBy = "bankAccount" , fetch = FetchType.LAZY)
private List<AccountOperation> accountOperations;
}
