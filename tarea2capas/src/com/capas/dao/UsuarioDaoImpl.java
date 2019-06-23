package com.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.capas.domain.Empleado;
import com.capas.domain.Sucursal;
import com.capas.domain.Usuario;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

	@PersistenceContext(unitName="capas")
	private EntityManager em;
	
	
	@Override
	public List<Empleado> find(Integer user) throws DataAccessException {
		StringBuffer sb = new StringBuffer(); 
		sb.append("select * from empleado where id_sucursalpk =:q1");
		Query query = em.createNativeQuery(sb.toString(),Empleado.class);
		query.setParameter("q1", user);
		List<Empleado> res = query.getResultList();
		return res;
	}


	@Override
	public List<Sucursal> findsucursal() throws DataAccessException {
		StringBuffer sb = new StringBuffer(); 
		sb.append("select * from sucursal");
		Query query = em.createNativeQuery(sb.toString(),Sucursal.class);
		List<Sucursal> res = query.getResultList();
		return res;
	}


	@Override
	public List<Sucursal> findsucursalone(Integer id) throws DataAccessException {
		StringBuffer sb = new StringBuffer(); 
		sb.append("select * from sucursal where id_sucursal =:s1");
		Query query = em.createNativeQuery(sb.toString(),Sucursal.class);
		query.setParameter("s1", id);
		List<Sucursal> res = query.getResultList();
		return res;
	}


	@Override
	public Integer deletempleado(Integer id) throws DataAccessException {
		StringBuffer sb = new StringBuffer(); 
		sb.append("delete from empleado where id_sucursalpk =:s1");
		Query query = em.createNativeQuery(sb.toString(),Empleado.class);
		query.setParameter("s1", id);
		Integer res = query.executeUpdate();
		return res;
	}


	@Override
	public List<Sucursal> deletesucursal(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}



}
