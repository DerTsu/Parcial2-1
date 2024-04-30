package com.co.orteguitauwu.usuarios.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.co.orteguitauwu.usuarios.entity.Alumno;
import com.co.orteguitauwu.usuarios.service.AlumnoService;

@RestController
public class AlumnoController {

	@Autowired
	AlumnoService service;
	
	@Value("${config.balanceador.test}")
	private String balanceadorTest;
	
	@GetMapping("/balanceador-test")
	public ResponseEntity<?> balanceadorTest(){
		
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("balanceador", balanceadorTest);
		response.put("alumno", service.findAll());
		
		return ResponseEntity.ok().body(response);
		
	}
	
	@GetMapping
	public ResponseEntity<?> listarAlumno(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping("/alumno/{id}")
	public ResponseEntity<?> ver(@PathVariable Long id){
		
		Optional<Alumno> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok().body(ob.get());
	}
	
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Alumno alumno){
		Alumno alumnoDb = service.save(alumno);
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnoDb);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id){
		Optional<Alumno> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		Alumno alumnoBd = ob.get();
		alumnoBd.setNombre(alumno.getNombre());
		alumnoBd.setApellido(alumno.getApellido());
		alumnoBd.setEmail(alumno.getEmail());
		alumnoBd.setNombre(alumno.getNombre());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service);
		
	}
	
	 @DeleteMapping("/{id}")
	 private ResponseEntity<?> eliminar(@PathVariable Long id){
		
		 service.deleteById(id);
		 return ResponseEntity.noContent().build();
	}
	
}
