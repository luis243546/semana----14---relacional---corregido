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
@Table(name="vehiculos")
@Getter
@Setter
@NoArgsConstructor
public class Vehiculos extends BaseEntity{

    private String marca;
    private String modelo;
    

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "vehiculos")

    List<ClienteVehiculo> dos;
}
