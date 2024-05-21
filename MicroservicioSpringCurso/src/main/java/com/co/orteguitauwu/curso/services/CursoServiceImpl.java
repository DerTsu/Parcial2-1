package com.co.orteguitauwu.curso.services;

import org.springframework.stereotype.Service;

import com.co.orteguitauwu.common.curso.models.entity.Curso;
import com.co.orteguitauwu.commons.service.CommonService;
import com.co.orteguitauwu.commons.service.CommonServiceImpl;
import com.co.orteguitauwu.curso.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CommonService<Curso> {

}