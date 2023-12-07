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

import com.tarea.tarea.entity.Vehiculos;
import com.tarea.tarea.service.VehiculosService;

@RestController
public class VehiculosController {
    
    @Autowired
    VehiculosService vehiS;


    @GetMapping("/1lista")
	public List<Vehiculos> verTodo() {
		return vehiS.listar();
	}

	@GetMapping("/1lista/{id}")
	public Vehiculos verUno(@PathVariable Long id) {
		return vehiS.verUno(id);
	}

	@PostMapping("/1registrar")
	public Vehiculos registar(@RequestBody Vehiculos vehiculos){
		return vehiS.registrar(vehiculos);
	}

	@PutMapping("/1actualizar/{id}")
	public Vehiculos actualizar(@RequestBody Vehiculos vehiculos, @PathVariable Long id){
		return vehiS.actualizar(vehiculos,id);
	}

	@DeleteMapping("/1eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		vehiS.eliminar(id);
	}
}
