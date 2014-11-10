package com.marioaliaga.junaeb.service.impl;

import java.util.List;

import com.marioaliaga.junaeb.dao.CursoDao;
import com.marioaliaga.junaeb.dao.impl.CursoDaoImpl;
import com.marioaliaga.junaeb.dto.Curso;
import com.marioaliaga.junaeb.service.AlumnoService;
import com.marioaliaga.junaeb.util.JsonResponse;

public class AlumnoServiceImpl implements AlumnoService {

	private CursoDao cursoDao = new CursoDaoImpl();

	@Override
	public JsonResponse getCursos() {
		JsonResponse response = new JsonResponse();

		try {
			response.setBody(cursoDao.getCursos());
			response.setSuccessToTrue();
		} catch (Exception e) {
			e.printStackTrace();
			response.setMensaje("Error al obtener cursos.");
		}

		return response;
	}

}
