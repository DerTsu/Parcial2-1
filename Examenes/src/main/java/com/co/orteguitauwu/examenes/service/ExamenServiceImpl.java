package com.co.orteguitauwu.examenes.service;

import org.springframework.stereotype.Service;

import com.co.orteguitauwu.common.examen.models.entity.Examen;
import com.co.orteguitauwu.commons.service.CommonService;
import com.co.orteguitauwu.commons.service.CommonServiceImpl;
import com.co.orteguitauwu.examenes.repository.ExamenRepository;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen,ExamenRepository> implements CommonService<Examen>{

}
