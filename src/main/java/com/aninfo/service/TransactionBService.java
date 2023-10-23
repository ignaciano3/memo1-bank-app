package com.aninfo.service;


import com.aninfo.model.Transaction;
import com.aninfo.model.Transaction;
import com.aninfo.model.TransactionB;
import com.aninfo.model.TransactionType;
import com.aninfo.repository.TransactionBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

import javax.transaction.Transactional;

@Service
public class TransactionBService {
    @Autowired
    private TransactionBRepository transactionBRepository;

    public TransactionB createTransaction(TransactionB transaction) {
        return transactionBRepository.save(transaction);
    }

    public Collection<Transaction> getTransactions() {
        return transactionBRepository.findAll();
    }

    public Optional<Transaction> findById(Long cbu) {
        return transactionBRepository.findById(cbu);
    }

    public void save(Transaction transaction) {
        transactionBRepository.save(transaction);
    }

    public void deleteById(Long Id) {
        transactionBRepository.deleteById(Id);
    }
}
