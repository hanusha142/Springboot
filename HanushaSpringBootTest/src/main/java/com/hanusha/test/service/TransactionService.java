package com.hanusha.test.service;

import com.hanusha.test.model.Period;
import com.hanusha.test.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransactionService {

    private final List<Transaction> transactions;

    @Autowired
    public TransactionService(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Transaction> getAllTransactions(Period period){
        return transactions.stream().filter(txn->
                !txn.getTransactionDate().isBefore(period.getFrom())
                && !txn.getTransactionDate().isAfter(period.getTo()))
                .collect(Collectors.toList());
    }
}
