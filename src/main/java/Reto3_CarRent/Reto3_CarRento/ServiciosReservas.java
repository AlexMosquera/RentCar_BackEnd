/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_CarRent.Reto3_CarRento;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alex Mosquera
 */
@Service
public class ServiciosReservas {
    @Autowired
    private RepositoioReservas metodosCrud;
    
    public List<Reservas> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Reservas> getReservas(int IdReservation) {
        return metodosCrud.getReservas(IdReservation);
    }

    public Reservas save(Reservas reservation) {
        if (reservation.getIdReservation() == null) {
            return metodosCrud.save(reservation);
        } else {
            Optional<Reservas> evt = metodosCrud.getReservas(reservation.getIdReservation());
            if (evt.isEmpty()) {
                return metodosCrud.save(reservation);
            } else {
                return reservation;
            }
        }
    }
}
