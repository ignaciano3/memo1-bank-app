package com.aninfo.model;

import javax.persistence.*;

@Entity
public class TransactionB {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int x = 3;

    public TransactionB(){

    }
}