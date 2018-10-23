package com.exact.service.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exact.service.menu.entity.Menu;
import com.exact.service.menu.entity.Opcion;
import com.exact.service.menu.entity.OpcionPermiso;
import com.exact.service.menu.entity.OpcionPermisoId;
import com.exact.service.menu.service.classes.MenuService;
import com.exact.service.menu.service.classes.OpcionPermisoService;

@RestController
@RequestMapping("/permisos")
public class PermisoController {
	
	@Autowired
	private MenuService menuService;
	
	@Autowired
	private OpcionPermisoService opcionPermisoService;
	
	
	@GetMapping("{permisoId}/menus")
	public ResponseEntity<Iterable<Menu>> listarMenuByPermisoId(@PathVariable Long permisoId){
		return new ResponseEntity<Iterable<Menu>>(menuService.listarByPermisoId(permisoId), HttpStatus.OK);
	}
	
	@PostMapping("{permisoId}/opciones")
	public ResponseEntity<OpcionPermiso> guardarOpcionPermiso(@RequestBody Opcion opcion, @PathVariable Long permisoId) {
		OpcionPermiso opcionPermiso = new OpcionPermiso(new OpcionPermisoId(opcion.getId(), permisoId), opcion);
		OpcionPermiso opcionPermisoNuevo = opcionPermisoService.save(opcionPermiso);
		return new ResponseEntity<OpcionPermiso>(opcionPermisoNuevo, opcionPermisoNuevo == null ? HttpStatus.INTERNAL_SERVER_ERROR : HttpStatus.OK);
	}
	
}	
