/**
 * 
 */
package com.uniquindio.FincApp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

/**
 * 
 * Clase que representa a la finca
 * 
 * @author Darwin Bonilla
 *
 */
@Entity
@Table(name = "finca")
public class Estate implements Serializable{

	@Id
	private Long idfinca;
	
	@NotNull
	@Column(nullable = false)
	private String nombre;
	
	@NotNull
	private String ubicacion;
	
	@NotNull
	@Column(nullable = false)
	private String hectareas;
	
	@NotNull
	@Column(nullable = false)
	private int arriendo;
	
	@NotNull
	@Column(nullable = false)
	private int servicios;
	
	@NotNull
	@Column(nullable = false)
	private String usuario_cedula;
	
	@OneToMany(mappedBy="finca", cascade=CascadeType.ALL)
	private List<Employee> trabajadores;
}
