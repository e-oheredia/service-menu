package com.exact.service.menu.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.service.menu.entity.OpcionPermiso;
import com.exact.service.menu.entity.OpcionPermisoId;

@Repository
public interface IOpcionPermisoDao extends CrudRepository<OpcionPermiso, OpcionPermisoId>{
	
}
