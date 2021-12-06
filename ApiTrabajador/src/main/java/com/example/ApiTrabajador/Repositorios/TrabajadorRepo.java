package com.example.ApiTrabajador.Repositorios;

import java.util.ArrayList;

import com.example.ApiTrabajador.Modelos.TrabajadorModelo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajadorRepo extends MongoRepository<TrabajadorModelo, Long>{
    ArrayList<TrabajadorModelo> findByNombre(String nombre);
    TrabajadorModelo findByCorreo(String correo);
}
