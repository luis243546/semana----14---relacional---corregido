package com.tarea.tarea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea.tarea.dao.VehiculosDao;
import com.tarea.tarea.entity.Vehiculos;

@Service
public class VehiculosServiceImpl implements VehiculosService{

    @Autowired
    VehiculosDao vehiculos;

    @Override
    public List<Vehiculos> listar() {
        return (List<Vehiculos>) vehiculos.findAll();
    }

    @Override
    public Vehiculos verUno(Long id) {
        return vehiculos.findById(id).orElse(null);
    }

    @Override
    public Vehiculos registrar(Vehiculos vehiculo) {
        return vehiculos.save(vehiculo);
    }

    @Override
    public Vehiculos actualizar(Vehiculos vehiculo, Long id) {
        return null;
    }

    @Override
    public void eliminar(Long id) {
        vehiculos.deleteById(id);
    }
    
}
