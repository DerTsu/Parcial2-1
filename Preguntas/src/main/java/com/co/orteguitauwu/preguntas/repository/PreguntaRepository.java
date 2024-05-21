package com.co.orteguitauwu.preguntas.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.orteguitauwu.common.respuesta.models.entity.Pregunta;

public interface PreguntaRepository extends CrudRepository<Pregunta, Long> {

}
