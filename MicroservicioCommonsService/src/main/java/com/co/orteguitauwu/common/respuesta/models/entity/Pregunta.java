package com.co.orteguitauwu.common.respuesta.models.entity;

import java.util.List;

import com.co.orteguitauwu.common.examen.models.entity.Examen;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="preguntas")
public class Pregunta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
	private String texto;

	@JsonIgnoreProperties(value = {"preguntas"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "examen_id")
	private Examen examen;

	@OneToMany(mappedBy = "examen", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Pregunta> preguntas;
	
	public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public Examen getExamen() {
        return examen;
    }
 
    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }
    
    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas; // Simplemente asigna la nueva lista
    }
	
    public void addPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
        pregunta.setExamen(this.examen);
    }

    public void removePregunta(Pregunta pregunta) {
        preguntas.remove(pregunta);
        pregunta.setExamen(null);
    }
}
