/**
 * 
 */
package com.uniquindio.FincApp.model;

import java.io.Serializable;
import java.util.Date;
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
 * Clase que representa un cultivo dentro de la finca
 *  
 * @author Darwin Bonilla
 *
 */
@Entity
@Table(name = "cultivo")
public class Cultivation implements Serializable{

	@Id
	private Long idcultivo;
	
	@NotNull
	@Column(nullable = false)
	private String tipoCultivo;
	
	@NotNull
	@Column(nullable = false)
	private int cantidad;
	
	@NotNull
	@Column(nullable = false)
	private Date fecha;
	
	@OneToMany(mappedBy="cultivo", cascade=CascadeType.ALL)
	private List<Employee> trabajadores;
}
