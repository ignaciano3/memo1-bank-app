package com.aninfo.repository;

import com.aninfo.model.Account;
import com.aninfo.model.TransactionB;
import java.util.List;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public class TransactionBRepository extends CrudRepository<TransactionB, Long> {

    TransactionB findTransactionBById(Long id);
    @Override
    List<TransactionB> findAll();
}


