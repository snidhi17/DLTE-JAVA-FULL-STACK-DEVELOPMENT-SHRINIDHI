package com.example.java8.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int creditCardId;
    @Column(nullable = false)
    private String cardType;
    @Column(nullable = false)
    private String expMonth;
    @Column(nullable = false)
    private int expYear;



}
