package com.tarea.tarea.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea.tarea.dao.ClientesDao;
import com.tarea.tarea.entity.Clientes;

@Service
public class ClientesServiceImpl implements ClientesService{

    @Autowired
    ClientesDao clientesDao;

    @Override
    public List<Clientes> listar() {
        return (List<Clientes>) clientesDao.findAll();
    }

    @Override
    public Clientes verUno(Long id) {
        return clientesDao.findById(id).orElse(null);
    }

    @Override
    public Clientes registrar(Clientes cliente) {
        return clientesDao.save(cliente);
    }

    @Override
    public Clientes actualizar(Clientes cliente, Long id) {
        return null;
    }

    @Override
    public void eliminar(Long id) {
        clientesDao.deleteById(id);
    }
    
}
