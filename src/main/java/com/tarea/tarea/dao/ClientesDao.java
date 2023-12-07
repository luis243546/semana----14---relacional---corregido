package com.tarea.tarea.dao;

import org.springframework.data.repository.CrudRepository;

import com.tarea.tarea.entity.Clientes;

public interface ClientesDao extends CrudRepository<Clientes, Long>{
    
}
