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
public class RepositorioGamas {
    @Autowired
    private InterfaceGamas crud;
    
    public List<Gamas> getAll(){
        return(List<Gamas>) crud.findAll();  
    }
    
    public Optional <Gamas> getGamas(int id){
        return crud.findById(id);
    }
    
    public Gamas save(Gamas gama){
        return crud.save(gama);
    }
}
