/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_CarRent.Reto3_CarRento;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alex Mosquera
 */
@Repository
public class RepositoioReservas {
    
    @Autowired
    private InterfaceReservas crud;
    
    public List<Reservas> getAll() {
        return (List<Reservas>) crud.findAll();
    }

    public Optional<Reservas> getReservas(int id) {
        return crud.findById(id);
    }

    public Reservas save(Reservas reservation) {
        return crud.save(reservation);
    }
}
