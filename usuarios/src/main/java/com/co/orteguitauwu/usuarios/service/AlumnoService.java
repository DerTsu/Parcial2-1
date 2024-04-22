package com.co.orteguitauwu.usuarios.service;

import java.util.Optional;

import com.co.orteguitauwu.usuarios.entity.Alumno;

public interface AlumnoService {

	public Iterable<Alumno>  findAll();
	
	public Optional<Alumno> findById(long id);
	
	public Alumno save(Alumno alumno);
	
	public void deleteById (Long id);
}
