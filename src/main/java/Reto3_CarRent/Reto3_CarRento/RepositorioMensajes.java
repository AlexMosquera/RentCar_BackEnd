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
public class RepositorioMensajes {

    @Autowired
    private InterfaceMensajes crud;

    public List<Mensajes> getAll() {
        return (List<Mensajes>) crud.findAll();
    }

    public Optional<Mensajes> getMensajes(int id) {
        return crud.findById(id);
    }

    public Mensajes save(Mensajes message) {
        return crud.save(message);
    }
}
