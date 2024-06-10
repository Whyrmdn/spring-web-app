package com.example.restaurant.Repositories;

import com.example.restaurant.Model.ReservationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationDetailsRepository extends JpaRepository<ReservationDetails, Long> {
}