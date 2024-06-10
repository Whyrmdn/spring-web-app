package com.example.restaurant.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

import io.micrometer.common.lang.NonNull;

@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String phone;
    @NonNull
    private String email;

    @OneToMany(mappedBy = "customer")
    private List<Reservations> reservations;

    // Getters and Setters
}