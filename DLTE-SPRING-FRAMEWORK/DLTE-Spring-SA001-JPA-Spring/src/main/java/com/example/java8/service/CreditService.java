package com.example.java8.service;

import com.example.java8.model.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.java8.repository.CreditCardRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CreditService {
    @Autowired
    private CreditCardRepository repository;

    public CreditCard implementationOfSave(CreditCard creditCard) {
        return repository.save(creditCard);


    }

  


}

