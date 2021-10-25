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
public class ServiciosCars {
    
    @Autowired
    private RepositorioCars metodosCrud;
    
    public List<Cars> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Cars> getCars(int idCar){
        return metodosCrud.getCars(idCar);
    }
    
    public Cars save(Cars car){
        if (car.getIdCar() == null){
            return metodosCrud.save(car);
        }else{
            Optional<Cars> evt=metodosCrud.getCars(car.getIdCar());
            if (evt.isEmpty()){
                return metodosCrud.save(car);
            }else{
                return car;
            }
        }
    }
    
    
}
