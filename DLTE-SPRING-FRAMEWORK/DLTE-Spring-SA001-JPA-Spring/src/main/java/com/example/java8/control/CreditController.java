package com.example.java8.control;

import com.example.java8.model.CreditCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.java8.service.CreditService;

import java.util.List;
import java.util.Optional;

@RestController
public class CreditController {

    @Autowired
    private CreditService creditService;

    @PostMapping("/insert")
    public CreditCard callingSave(@RequestBody CreditCard creditCard) {
        return creditService.implementationOfSave(creditCard);


    }
}



