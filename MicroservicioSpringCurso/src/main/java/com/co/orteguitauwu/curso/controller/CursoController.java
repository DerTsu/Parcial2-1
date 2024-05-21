package com.co.orteguitauwu.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.orteguitauwu.common.curso.models.entity.Curso;
import com.co.orteguitauwu.common.usuario.models.entity.Alumno;
import com.co.orteguitauwu.commons.controller.CommonController;
import com.co.orteguitauwu.curso.services.CursoService;
//import com.co.orteguitauwu.usuarios.entity.Alumno;

@RestController
public class CursoController extends CommonController<Curso, CursoService>{

	/*
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Curso curso, @PathVariable Long id){
		Optional<Curso> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Curso alumnoBd = ob.get();
		alumnoBd.setNombre(curso.getNombre());
		alumnoBd.setApellido(curso.getApellido());
		alumnoBd.setEmail(curso.getEmail());
		alumnoBd.setNombre(curso.getNombre());
		return ResponseEntity.status(HttpStatus.CREATED).body(service);
		
	}*/
	@PutMapping("/{id}/asignar-alumno")
	public ResponseEntity<?> asignarAlumno(@RequestBody List<Alumno> alumno, @PathVariable Long id){
		Optional<Curso> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Curso cursoBd = ob.get();
		alumno.forEach(a -> {
			cursoBd.addAlumnos(a);
		});
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoBd));
		
	}
	
	@PutMapping("/{id}/eliminar-alumno")
	public ResponseEntity<?> eliminarAlumno(@RequestBody Alumno alumno, @PathVariable Long id){
		Optional<Curso> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Curso cursoBd = ob.get();
		
		cursoBd.removeAlumnos(alumno);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(cursoBd));
		
	}

	
}
