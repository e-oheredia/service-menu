package com.exact.service.menu.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="opcion_permiso")
public class OpcionPermiso implements Serializable {
	
	@EmbeddedId
	private OpcionPermisoId id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@MapsId("opcionId")
	@JoinColumn(name="opcion_id")
	@JsonIgnore
	private Opcion opcion;		
	
	public OpcionPermiso() {
	}
	
	public OpcionPermiso(OpcionPermisoId id, Opcion opcion) {
		this.id = id;
		this.opcion = opcion;
	}
	public OpcionPermisoId getId() {
		return id;
	}
	public void setId(OpcionPermisoId id) {
		this.id = id;
	}

	public Opcion getOpcion() {
		return opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
