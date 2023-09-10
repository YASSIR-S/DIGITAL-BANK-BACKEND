package com.yassir.digitalbank.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yassir.digitalbank.entities.BankAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data


public class CustomerDTO {

    private Long id;
    private String name;
    private String email;



}
