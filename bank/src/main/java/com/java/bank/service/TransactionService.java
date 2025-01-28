package com.java.bank.service;

import com.java.bank.dto.TransacctionDto;

public interface TransactionService {
    void saveTransaction(TransacctionDto transacctionDto);
}