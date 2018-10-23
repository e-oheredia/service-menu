package com.exact.service.menu.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="menu")
public class Menu implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="menu_id")
	private Long id;
	@Column(nullable=false, length=100)
	private String nombre; 
	@Column(length=100)
	private String claseIcono; 
	private boolean activo;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name="jerarquia_menu", joinColumns = { @JoinColumn(name = "menu_padre_id") },
    inverseJoinColumns = { @JoinColumn(name = "menu_hijo_id") })
	private Set<Menu> hijosMenu;

	@OneToOne(fetch=FetchType.EAGER, mappedBy="menu", cascade = CascadeType.ALL)
	private Opcion opcion;		
	
	public Opcion getOpcion() {
		return opcion;
	}
	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
		this.opcion.setMenu(this);
	}
	public Set<Menu> getHijosMenu() {
		return hijosMenu;
	}
	public void setHijosMenu(Set<Menu> hijosMenu) {
		this.hijosMenu = hijosMenu;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClaseIcono() {
		return claseIcono;
	}
	public void setClaseIcono(String claseIcono) {
		this.claseIcono = claseIcono;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
