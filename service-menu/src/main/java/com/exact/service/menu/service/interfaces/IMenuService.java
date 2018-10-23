package com.exact.service.menu.service.interfaces;

import java.util.List;

import com.exact.service.menu.entity.Menu;

public interface IMenuService {
	public Iterable<Menu> listarAll();
	public Iterable<Menu> guardarAll(Iterable<Menu> menus);
	public Iterable<Menu> listarPrimerNivel();
	Iterable<Menu> listarByPermisoId(Long permisoId);
	Iterable<Menu> listarByPermisoIds(List<Long> permisoId);
}
