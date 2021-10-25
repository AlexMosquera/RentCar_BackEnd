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
public class ServiciosMensajes {

    @Autowired
    private RepositorioMensajes metodosCrud;

    public List<Mensajes> getAll() {
        return metodosCrud.getAll();
    }

    public Optional<Mensajes> getMensajes(int IdMessage) {
        return metodosCrud.getMensajes(IdMessage);
    }

    public Mensajes save(Mensajes message) {
        if (message.getIdMessage() == null) {
            return metodosCrud.save(message);
        } else {
            Optional<Mensajes> evt = metodosCrud.getMensajes(message.getIdMessage());
            if (evt.isEmpty()) {
                return metodosCrud.save(message);
            } else {
                return message;
            }
        }
    }

}
