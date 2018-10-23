package com.exact.service.menu.service.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exact.service.menu.dao.IOpcionPermisoDao;
import com.exact.service.menu.entity.OpcionPermiso;
import com.exact.service.menu.service.interfaces.IOpcionPermisoService;

@Service
public class OpcionPermisoService implements IOpcionPermisoService {

	@Autowired
	IOpcionPermisoDao opcionPermisoDao;
	
	@Override
	public OpcionPermiso save(OpcionPermiso opcionPermiso) {
		return opcionPermisoDao.save(opcionPermiso);
	}

}
