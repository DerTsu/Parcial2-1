package com.co.orteguitauwu.preguntas.service;

import org.springframework.stereotype.Service;

import com.co.orteguitauwu.common.respuesta.models.entity.Pregunta;
import com.co.orteguitauwu.commons.service.CommonService;
import com.co.orteguitauwu.commons.service.CommonServiceImpl;
import com.co.orteguitauwu.preguntas.repository.PreguntaRepository;

@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta,PreguntaRepository> implements CommonService<Pregunta>{

}
