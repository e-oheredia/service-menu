package com.exact.service.menu.service.classes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exact.service.menu.dao.IMenuDao;
import com.exact.service.menu.dao.IOpcionDao;
import com.exact.service.menu.entity.Menu;
import com.exact.service.menu.entity.Opcion;
import com.exact.service.menu.service.interfaces.IMenuService;
import com.exact.service.menu.utils.MenuUtils;

@Service
public class MenuService implements IMenuService {
	
	@Autowired
	IMenuDao menuDao;
	
	@Autowired
	IOpcionDao opcionDao;
	
	@Override
	public Iterable<Menu> listarByPermisoId(Long permisoId) {
		Iterable<Menu> menuPrimerNivel = menuDao.listarPrimerNivel();
		Iterable<Opcion> opcionesPermiso = opcionDao.findAllByIdPermiso(permisoId);
		Iterable<Long> idOpcionesPermiso = ((List<Opcion>)opcionesPermiso).stream().map(Opcion::getId).collect(Collectors.toList());
		menuPrimerNivel = MenuUtils.removerMenuInutilizado((List<Menu>)menuPrimerNivel, idOpcionesPermiso);
		return menuPrimerNivel;
	}

	@Override
	public Iterable<Menu> listarAll() {
		return menuDao.findAll();
	}
	
	@Override
	public Iterable<Menu> guardarAll(Iterable<Menu> menus) {
		Iterable<Menu> menuNoIncluido = 
				(Iterable<Menu>) menuDao.listarNoEncontrados(((List<Menu>)menus)
				.stream().map(Menu::getId).collect(Collectors.toList()));
		menuDao.deleteAll(menuNoIncluido);
		return menuDao.saveAll(menus);
	}
	
	@Override
	public Iterable<Menu> listarPrimerNivel() {
		return menuDao.listarPrimerNivel();
	}

	@Override
	public Iterable<Menu> listarByPermisoIds(List<Long> permisoIds) {		
		Iterable<Menu> menuPrimerNivel = menuDao.listarPrimerNivel();
		Iterable<Opcion> opcionesPermiso = opcionDao.findAllByIdPermisoIn(permisoIds);
		Iterable<Long> idOpcionesPermiso = ((List<Opcion>)opcionesPermiso).stream().map(Opcion::getId).collect(Collectors.toList());
		menuPrimerNivel = MenuUtils.removerMenuInutilizado((List<Menu>)menuPrimerNivel, idOpcionesPermiso);
		return menuPrimerNivel;
	}

}
