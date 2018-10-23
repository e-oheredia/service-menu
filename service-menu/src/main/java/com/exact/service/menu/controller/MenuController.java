package com.exact.service.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.exact.service.menu.entity.Menu;
import com.exact.service.menu.service.interfaces.IMenuService;

@RestController
@RequestMapping("/menus")
public class MenuController {
	
	@Autowired
	IMenuService menuService;
	
	@GetMapping
	public ResponseEntity<Iterable<Menu>> listarPrimerNivel(){
		return new ResponseEntity<Iterable<Menu>>(menuService.listarPrimerNivel(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Iterable<Menu>> guardarMenu(@RequestBody Iterable<Menu> menus){
		return new ResponseEntity<Iterable<Menu>>(menuService.guardarAll(menus), HttpStatus.OK);
	}
	
	@GetMapping(params = {"permisoIds"})
	public ResponseEntity<Iterable<Menu>> listarByPermisoIds(@RequestParam List<Long> permisoIds){
		return new ResponseEntity<Iterable<Menu>>(menuService.listarByPermisoIds(permisoIds), HttpStatus.OK);
	}
}
