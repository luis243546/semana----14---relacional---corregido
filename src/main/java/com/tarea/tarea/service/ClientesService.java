package com.tarea.tarea.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tarea.tarea.entity.Clientes;

@Service
public interface ClientesService {

    public List<Clientes> listar();
	
	public Clientes verUno(Long id);

    public Clientes registrar(Clientes cliente);

    public Clientes actualizar(Clientes cliente, Long id);

    public void eliminar(Long id);
}
