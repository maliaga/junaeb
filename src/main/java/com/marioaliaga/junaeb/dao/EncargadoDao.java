package com.marioaliaga.junaeb.dao;

public interface EncargadoDao {

	Boolean validaLogin(String email_usuario, String password_usuario) throws Exception;
}
