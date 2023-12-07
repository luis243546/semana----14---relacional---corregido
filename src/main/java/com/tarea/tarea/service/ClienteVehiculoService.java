package com.tarea.tarea.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tarea.tarea.entity.ClienteVehiculo;

@Service
public interface ClienteVehiculoService {
    
    public List<ClienteVehiculo> listar();
	
	public ClienteVehiculo verUno(Long id);

    public ClienteVehiculo registrar(ClienteVehiculo carro);

    public ClienteVehiculo actualizar(ClienteVehiculo carro, Long id);

    public void eliminar(Long id);
}
