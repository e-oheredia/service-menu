package com.exact.service.menu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OpcionPermisoId implements Serializable {	
	
	@Column(name="opcion_id")
	private Long opcionId;
	@Column(name="permiso_id")
	private Long permisoId;
	
	public OpcionPermisoId() {
		super();
	}
	public OpcionPermisoId(Long opcionId, Long permisoId) {
		super();
		this.opcionId = opcionId;
		this.permisoId = permisoId;
	}
	public Long getOpcionId() {
		return opcionId;
	}
	public void setOpcionId(Long opcionId) {
		this.opcionId = opcionId;
	}
	public Long getPermisoId() {
		return permisoId;
	}
	public void setPermisoId(Long permisoId) {
		this.permisoId = permisoId;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
}
