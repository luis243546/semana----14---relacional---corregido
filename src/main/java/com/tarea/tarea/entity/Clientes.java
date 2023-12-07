package com.tarea.tarea.entity;



import java.util.List;

import com.tarea.tarea.shared.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="clientes")
@Getter
@Setter
@NoArgsConstructor
public class Clientes extends BaseEntity{
    
    private String nombre_cliente;
    private String apellido_cliente;
    private String direccion_cliente;
    private String ciudad_cliente;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "clientes")

    List<ClienteVehiculo>uno;

}
