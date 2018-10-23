package com.exact.service.menu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exact.service.menu.entity.Menu;

@Repository
public interface IMenuDao extends CrudRepository<Menu, Long> {
	
	@Query(value="SELECT M.* FROM Menu M WHERE NOT EXISTS (SELECT JM.menu_hijo_id FROM jerarquia_menu JM WHERE JM.menu_hijo_id = M.menu_id)", 
			nativeQuery=true
		   )
	public Iterable<Menu> listarPrimerNivel();
	
	@Query("SELECT M FROM Menu M WHERE M.id NOT IN :ids")
	public Iterable<Menu> listarNoEncontrados(@Param("ids") List<Long> ids);
}
