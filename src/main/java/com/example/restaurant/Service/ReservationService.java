package com.example.restaurant.Service;

import com.example.restaurant.Model.Reservations;
import com.example.restaurant.Repositories.ReservationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationsRepository reservationsRepository;

    public List<Reservations> getAllReservations() {
        return ReservationsRepository.findAll();
    }

    public Reservations createReservation(Reservations reservation) {
        return reservationsRepository.save(reservation);
    }

}
