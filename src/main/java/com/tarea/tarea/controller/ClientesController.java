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

import com.tarea.tarea.entity.Clientes;
import com.tarea.tarea.service.ClientesService;


@RestController
public class ClientesController {
    
    @Autowired
    ClientesService serviceC;


    @GetMapping("/lista")
	public List<Clientes> verTodo() {
		return serviceC.listar();
	}

	@GetMapping("/lista/{id}")
	public Clientes verUno(@PathVariable Long id) {
		return serviceC.verUno(id);
	}

	@PostMapping("/registrar")
	public Clientes registar(@RequestBody Clientes cliente){
		return serviceC.registrar(cliente);
	}

	@PutMapping("/actualizar/{id}")
	public Clientes actualizar(@RequestBody Clientes cliente, @PathVariable Long id){
		return serviceC.actualizar(cliente,id);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		serviceC.eliminar(id);
	}
    
}
