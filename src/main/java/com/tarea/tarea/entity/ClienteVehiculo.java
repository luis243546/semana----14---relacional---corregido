package com.tarea.tarea.entity;

import com.tarea.tarea.shared.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tres")
@Getter
@Setter
@NoArgsConstructor
public class ClienteVehiculo extends BaseEntity{
  
    private String matricula;
    private String kilometros;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="id_cliente")
    
    private Clientes clientes;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="id_vehiculo")

    private Vehiculos vehiculos;
   

}
