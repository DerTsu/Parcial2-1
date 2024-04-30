package com.co.orteguitauwu.commons.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*
import com.co.orteguitauwu.usuarios.entity.Alumno;
import com.co.orteguitauwu.usuarios.repository.AlumnoRepository;
*/
public class CommonServiceImpl <E, R extends CrudRepository<E,Long>> implements CommonService<E> {

	@Autowired
	private R dao;
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	@Transactional
	public E save(E entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

}
