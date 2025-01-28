package com.java.bank.controller;

import com.java.bank.entity.Transaction;
import com.java.bank.service.BankStatement;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;




@RestController
@RequestMapping("/bankStatement")
@AllArgsConstructor
public class TransactionController {
    private BankStatement bankStatement;

    @GetMapping
    public List<Transaction> generatedBankStatement(@RequestParam String accountNumber,
                                                    @RequestParam String startDate,
                                                    @RequestParam String endDate)
            throws  FileNotFoundException {
        return bankStatement.generateStatement(accountNumber, startDate, endDate);

    }
}


