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
public class RepositorioCars {
    @Autowired
    private InterfaceCars crud;
    
    public List<Cars> getAll(){
        return(List<Cars>) crud.findAll();  
    }
    
    public Optional <Cars> getCars(int id){
        return crud.findById(id);
    }
    
    public Cars save(Cars car){
        return crud.save(car);
    }
}
