package com.interfaces.rdi.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "int_rdi_in")
@Data
public class IntRdiIn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String expedition;
    private Date fechaEvento;
    private Date fechaAlta;
    private String delegacion;
    private String usuario;
    private String objeto1;
    private String objeto2;
    private String objeto3;
    private String objeto4;
    private String objeto5;
    private Integer orden;
    private Date fechaComunicacion;
    private String dummy;
    private String situ;
    private String justi;
    private String teveCodigo;
    private String marcaHoraria;
    private String procedencia;
    private String inicidencia;
    private String generarEvento;
    private BigDecimal longitud;
    private BigDecimal latitud;
    private String inciCodigo;
    private String ampliacion;
    private Date fechaCierre;

}
