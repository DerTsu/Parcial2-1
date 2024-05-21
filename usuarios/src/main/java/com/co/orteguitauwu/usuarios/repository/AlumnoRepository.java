package com.co.orteguitauwu.usuarios.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.orteguitauwu.common.usuario.models.entity.Alumno;


public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
