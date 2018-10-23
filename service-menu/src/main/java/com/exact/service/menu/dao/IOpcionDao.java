package com.exact.service.menu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.service.menu.entity.Opcion;

@Repository
public interface IOpcionDao extends CrudRepository<Opcion, Long> {
	
	@Query("FROM Opcion O WHERE O IN (SELECT OP.opcion FROM OpcionPermiso OP WHERE OP.id.permisoId = ?1)")
	public Iterable<Opcion> findAllByIdPermiso(Long idPermiso);
	@Query("FROM Opcion O WHERE O IN (SELECT OP.opcion FROM OpcionPermiso OP WHERE OP.id.permisoId IN ?1)")
	public Iterable<Opcion> findAllByIdPermisoIn(List<Long> idsPermiso);
}
