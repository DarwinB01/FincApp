package com.uniquindio.FincApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Clase que representa el cargo de un trabajador dentro de la finca
 * 
 * @author Darwin Bonilla
 * 
 */
@Entity
public class Position {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCargo;
	private String tipoCargo;
	private String area;
	private int trabajador_cedula;
	

}
