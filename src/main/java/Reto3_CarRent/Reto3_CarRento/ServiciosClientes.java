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
public class ServiciosClientes {

    @Autowired
    private RepositorioClientes metodosCrud;

    public List<Clientes> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Clientes> getClientes(int clientId) {
        return metodosCrud.getClientes(clientId);
    }

    public Clientes save(Clientes client) {
        if (client.getIdClient() == null) {
            return metodosCrud.save(client);
        } else {
            Optional<Clientes> evt = metodosCrud.getClientes(client.getIdClient());
            if (evt.isEmpty()) {
                return metodosCrud.save(client);
            } else {
                return client;
            }
        }
    }
}
