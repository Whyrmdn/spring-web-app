package com.example.restaurant.Controller;


import com.example.reservation.model.Reservations;
import com.example.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public List<Reservations> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping
    public Reservations createReservation(@RequestBody Reservations reservation) {
        return reservationService.createReservation(reservation);
    }