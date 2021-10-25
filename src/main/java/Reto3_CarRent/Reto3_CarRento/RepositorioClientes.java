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
public class RepositorioClientes {

    @Autowired
    private InterfaceClientes crud;

    public List<Clientes> getAll() {
        return (List<Clientes>) crud.findAll();
    }

    public Optional<Clientes> getClientes(int id) {
        return crud.findById(id);
    }

    public Clientes save(Clientes Client) {
        return crud.save(Client);
    }
}
