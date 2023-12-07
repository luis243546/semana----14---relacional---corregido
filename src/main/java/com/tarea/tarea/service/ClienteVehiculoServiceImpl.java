package com.tarea.tarea.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarea.tarea.dao.ClienteVehiculoDao;
import com.tarea.tarea.entity.ClienteVehiculo;

@Service
public class ClienteVehiculoServiceImpl implements ClienteVehiculoService{

    @Autowired
    ClienteVehiculoDao clienteVehiculoDao;

    @Override
    public List<ClienteVehiculo> listar() {
        return (List<ClienteVehiculo>) clienteVehiculoDao.findAll();
    }

    @Override
    public ClienteVehiculo verUno(Long id) {
        return clienteVehiculoDao.findById(id).orElse(null);
    }

    @Override
    public ClienteVehiculo registrar(ClienteVehiculo carro) {
        return clienteVehiculoDao.save(carro);
    }

    @Override
    public ClienteVehiculo actualizar(ClienteVehiculo object, Long id) {
        Optional<ClienteVehiculo> objectExistenteOptional = clienteVehiculoDao.findById(id);

        if (objectExistenteOptional.isPresent()) {
            ClienteVehiculo cliveExistente = objectExistenteOptional.get();

            cliveExistente.setMatricula(object.getMatricula());
            cliveExistente.setKilometros(object.getKilometros());

            return clienteVehiculoDao.save(cliveExistente);
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long id) {
        clienteVehiculoDao.deleteById(id);
    }
    
}
