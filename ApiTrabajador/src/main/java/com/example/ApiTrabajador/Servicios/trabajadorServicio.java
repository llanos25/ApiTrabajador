package com.example.ApiTrabajador.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiTrabajador.Modelos.TrabajadorModelo;
import com.example.ApiTrabajador.Repositorios.TrabajadorRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class trabajadorServicio {

    @Autowired
    TrabajadorRepo repo;

    public TrabajadorModelo guardaTrabajador(TrabajadorModelo trabajador){
        return repo.save(trabajador);
    }

    public ArrayList<TrabajadorModelo> consultaTodos(){
        return (ArrayList<TrabajadorModelo>) repo.findAll();
    }

    public boolean eliminaTrabajador(Long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        else{
            return false;
        }      
    }

    public Optional<TrabajadorModelo> consultaTrabajadorId(Long id){
        return repo.findById(id);
    }
    
    public ArrayList<TrabajadorModelo> obtenerTrabajadorPorNombre(String nombre){
        return repo.findByNombre(nombre);
    }

    public TrabajadorModelo obtenerPorCorreo(String correo){
        return repo.findByCorreo(correo);
    }



    
}
