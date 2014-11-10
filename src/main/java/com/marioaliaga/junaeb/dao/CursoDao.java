package com.marioaliaga.junaeb.dao;

import java.sql.SQLException;
import java.util.List;

import com.marioaliaga.junaeb.dto.Curso;

public interface CursoDao {
	
	public List<Curso> getCursos() throws SQLException;  

}
