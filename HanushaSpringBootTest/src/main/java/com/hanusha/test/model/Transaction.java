package com.hanusha.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Transaction {
    private Customer customer;
    private int amount;
    private LocalDate transactionDate;
}
