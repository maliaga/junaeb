package com.marioaliaga.junaeb.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marioaliaga.junaeb.dao.EncargadoDao;
import com.marioaliaga.junaeb.dao.impl.EncargadoDaoImpl;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory
			.getLogger(LoginController.class);

	private EncargadoDao encargadoDao = new EncargadoDaoImpl();

	@RequestMapping("/home-layout")
	public String homeLayaut(@ModelAttribute("enc_usuario") String enc_usuario,
			@ModelAttribute("enc_password") String enc_password, ModelMap map) {

		String fordward = "";
		logger.info("enc_usuario : " + enc_usuario);
		logger.info("enc_password : " + enc_password);

		try {
			if (!enc_usuario.equals("") && !enc_password.equals("")) {
				if (encargadoDao.validaLogin(enc_usuario, enc_password)) {
					logger.info("***************************************************************");
					logger.info("***   Usuario " + enc_usuario
							+ " Validado Corectamente  ****");
					logger.info("****************************************************************");

					fordward = "home-layout";
				} else {
					logger.info("false");
					fordward = "login";
					map.addAttribute("result", "false");
				}
			} else {
				logger.info("false");
				fordward = "login";
				map.addAttribute("result", "false");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println();
		}

		logger.info("fordward : " + fordward);
		return fordward;
	}

	@RequestMapping("/home-clean")
	public String contenido() {
		return "common/home-clean";
	}

}
