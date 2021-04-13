/**
 * 
 */
package com.uniquindio.FincApp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

/**
 * Clase que representa a un trabajador dentro de la finca
 * 
 * @author Darwin Bonilla
 * 
 *
 */
@Entity
@Table(name = "trabajador")
public class Employee implements Serializable {

	@Id
	private Long cedula;

	@NotNull
	@Column(nullable = false)
	private String nombre;

	@NotNull
	@Column(nullable = false)
	private String horario;

	@NotNull
	@Column(nullable = false)
	private Long sueldo;

	@NotNull
	@Column(nullable = false)
	private int edad;

	@ManyToOne
	@JoinColumn(name = "finca_idfinca")
	private Estate finca;

	@ManyToOne
	@JoinColumn(name = "cultivo_idcultivo")
	private Cultivation cultivo;

	@NotNull
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Long getSueldo() {
		return sueldo;
	}

	public void setSueldo(Long sueldo) {
		this.sueldo = sueldo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Estate getFinca() {
		return finca;
	}

	public void setFinca(Estate finca) {
		this.finca = finca;
	}

	public Cultivation getCultivo() {
		return cultivo;
	}

	public void setCultivo(Cultivation cultivo) {
		this.cultivo = cultivo;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

}
