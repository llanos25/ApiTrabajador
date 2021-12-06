package com.example.ApiTrabajador.Controladores;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiTrabajador.Modelos.TrabajadorModelo;
import com.example.ApiTrabajador.Servicios.trabajadorServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorControlador {

    @Autowired
    trabajadorServicio serv;

    @PostMapping
    public TrabajadorModelo guardaCliente(@RequestBody TrabajadorModelo trabajador){
        return serv.guardaTrabajador(trabajador);
    }
    
    @GetMapping()
    public ArrayList<TrabajadorModelo> consultaTodos(){
        return serv.consultaTodos();
    }

    @DeleteMapping(path = "/{id}")
    public boolean eliminaTrabajador(@PathVariable("id") Long id){
        return serv.eliminaTrabajador(id);
    }

    @GetMapping(path = "/{id}")
    public Optional<TrabajadorModelo> consultaPorId(@PathVariable("id") Long id){
        return serv.consultaTrabajadorId(id);        
    }

    @GetMapping(path="/buscar/{nombre}")
    public ArrayList<TrabajadorModelo> obtenerPorNombre(@PathVariable("nombre") String nombre){
        return serv.obtenerTrabajadorPorNombre(nombre);
    }

    @GetMapping(path = "/buscacorreo/{correo}")
    public TrabajadorModelo obtenerPorCorreo(@PathVariable("correo") String correo){
        return serv.obtenerPorCorreo(correo);
    }


    
}
