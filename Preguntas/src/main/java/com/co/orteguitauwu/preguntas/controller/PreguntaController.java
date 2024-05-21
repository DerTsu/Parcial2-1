package com.co.orteguitauwu.preguntas.controller;

import org.springframework.web.bind.annotation.RestController;

import com.co.orteguitauwu.common.respuesta.models.entity.Pregunta;
import com.co.orteguitauwu.commons.controller.CommonController;
import com.co.orteguitauwu.preguntas.service.PreguntaService;

@RestController
public class PreguntaController extends CommonController<Pregunta, PreguntaService>{

}
