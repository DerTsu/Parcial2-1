package com.co.orteguitauwu.usuarios.service;

import java.util.Optional;

import com.co.orteguitauwu.common.usuario.models.entity.Alumno;
import com.co.orteguitauwu.commons.service.CommonService;


public interface AlumnoService extends CommonService<Alumno>{

	//public Iterable<Alumno>  findAll();
	
	//public Optional<Alumno> findById(long id);
	
	public Alumno save(Alumno alumno);
	
	public void deleteById (Long id);
}
