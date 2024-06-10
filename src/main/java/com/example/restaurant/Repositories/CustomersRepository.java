package com.example.restaurant.Repositories;

import com.example.restaurant.Model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
