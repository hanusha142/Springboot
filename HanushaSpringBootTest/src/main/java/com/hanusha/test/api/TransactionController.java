package com.hanusha.test.api;

import com.hanusha.test.model.Period;
import com.hanusha.test.model.Transaction;
import com.hanusha.test.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    public List<Transaction> getAllTransaction(@RequestParam("fromDate")LocalDate fromDate,
                                               @RequestParam("toDate")LocalDate toDate){
        return transactionService.getAllTransactions(Period.of(fromDate, toDate));
    }
}
