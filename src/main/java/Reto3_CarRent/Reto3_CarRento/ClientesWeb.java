/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_CarRent.Reto3_CarRento;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alex Mosquera
 */
@RestController
@RequestMapping("api/Client")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ClientesWeb {
    
    @Autowired
    private ServiciosClientes servicios;
    
    @GetMapping("/all")
    public List<Clientes> getClientes(){
        return servicios.getAll();
    }
    @GetMapping("/{id}")
    public Optional <Clientes> getClientes (@PathVariable("id")int idClient){
        return servicios.getClientes(idClient);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Clientes save(@RequestBody Clientes client){
        return servicios.save(client);
    }
         
}
