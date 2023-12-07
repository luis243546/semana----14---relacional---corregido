package com.tarea.tarea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tarea.tarea.entity.ClienteVehiculo;
import com.tarea.tarea.service.ClienteVehiculoService;

@RestController
public class ClienteVehiculoController {
    
    @Autowired
    ClienteVehiculoService clienteVehiculoService;

	@GetMapping("/verTodo")
	public List<ClienteVehiculo> verTodo() {
		return clienteVehiculoService.listar();
	}

	@GetMapping("/vertodo/{id}")
	public ClienteVehiculo verUno(@PathVariable Long id) {
		return clienteVehiculoService.verUno(id);
	}

	@PostMapping("/registrarr")
	public ClienteVehiculo registar(@RequestBody ClienteVehiculo carro){
		return clienteVehiculoService.registrar(carro);
	}

	@PutMapping("/actualizarr/{id}")
	public ClienteVehiculo actualizar(@RequestBody ClienteVehiculo carro, @PathVariable Long id){
		return clienteVehiculoService.actualizar(carro,id);
	}

	@DeleteMapping("/eliminarr/{id}")
	public void eliminar(@PathVariable Long id){
		clienteVehiculoService.eliminar(id);
	}

}
