package com.marioaliaga.junaeb.controllers;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.marioaliaga.junaeb.service.AlumnoService;
import com.marioaliaga.junaeb.service.impl.AlumnoServiceImpl;
import com.marioaliaga.junaeb.util.JsonResponse;

@Controller
public class AlumnoController {

	private static final Logger logger = LoggerFactory
			.getLogger(AlumnoController.class);

	private AlumnoService alumnoService = new AlumnoServiceImpl();

	@RequestMapping(value = "/view-add-alumnos", method = RequestMethod.GET)
	public String vieAddAlumnos(Locale locale, Model model) {
		logger.info("Go View Add Alumons {}.", locale);

		return "alumno/add-alumno";
	}

	@RequestMapping(value = "/get-cursos", method = RequestMethod.POST)
	public @ResponseBody String getCursos(HttpServletRequest httpRequest) {

		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();

		return gson.toJson(alumnoService.getCursos());

	}

}
