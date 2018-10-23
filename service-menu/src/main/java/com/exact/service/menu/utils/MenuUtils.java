package com.exact.service.menu.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.exact.service.menu.entity.Menu;

public class MenuUtils {
	
	public static Iterable<Menu> removerMenuInutilizado(List<Menu> menuGeneral, Iterable<Long> idOpcionesPerfil){
		
		int menuSize = menuGeneral.size();
		int i = 0;
		
		while (i < menuSize) {
			Menu menu = menuGeneral.get(i);
			if (menu.getOpcion() == null) {
				List<Menu> hijosMenu = new ArrayList<Menu>();
				hijosMenu.addAll(menu.getHijosMenu());
				menu.setHijosMenu(new HashSet<Menu>((Collection<? extends Menu>) removerMenuInutilizado(hijosMenu, idOpcionesPerfil)));				
			}else {
				if (!((List<Long>)idOpcionesPerfil).contains(menu.getId())) {
					menuGeneral.remove(menu);
					menuSize--;
					i--;
				}				
			}
			i++;
		}
		
		return removerMenuSinHijos(menuGeneral);
		
	}
	
	public static Iterable<Menu> removerMenuSinHijos(List<Menu> menuGeneral) {
		
		int menuSize = menuGeneral.size();
		int i = 0;
		
		while (i < menuSize) {
			Menu menu = menuGeneral.get(i);
			if (menu.getHijosMenu().isEmpty() && menu.getOpcion() == null) {
				menuGeneral.remove(menu);
				menuSize--;
			}else 
				i++;
			
			
		}
		
		return menuGeneral;
	}
	
	 

}
