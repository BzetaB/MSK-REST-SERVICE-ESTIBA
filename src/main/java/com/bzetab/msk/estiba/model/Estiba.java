package com.bzetab.msk.estiba.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "estiba")
public class Estiba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idestiba;
    @Column(name = "documento", nullable = false)
    private boolean documento;
    @Column(name = "nrodocumento", nullable = false, unique = true)
    private String nrodocumento;
    @Column(name = "contrasenia", nullable = false)
    private String contrasenia;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "edad", nullable = false)
    private int edad;
    @Column(name = "telefono",nullable = false)
    private String telefono;
}
