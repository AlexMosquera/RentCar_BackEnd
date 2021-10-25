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
public class ServiciosGamas {
    
     @Autowired
    private RepositorioGamas metodosCrud;
    
    public List<Gamas> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Gamas> getGamas(int idGama){
        return metodosCrud.getGamas(idGama);
    }
    
    public Gamas save(Gamas gamas){
        if (gamas.getIdGama()== null){
            return metodosCrud.save(gamas);
        }else{
            Optional<Gamas> evt=metodosCrud.getGamas(gamas.getIdGama());
            if (evt.isEmpty()){
                return metodosCrud.save(gamas);
            }else{
                return gamas;
            }
        }
    }
    
}
