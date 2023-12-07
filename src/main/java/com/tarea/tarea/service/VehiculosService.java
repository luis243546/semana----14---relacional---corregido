package com.tarea.tarea.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tarea.tarea.entity.Vehiculos;

@Service
public interface VehiculosService {
    public List<Vehiculos> listar();
	
	public Vehiculos verUno(Long id);

    public Vehiculos registrar(Vehiculos vehiculo);

    public Vehiculos actualizar(Vehiculos vehiculo, Long id);

    public void eliminar(Long id);
}
