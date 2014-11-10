package com.marioaliaga.junaeb.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.marioaliaga.junaeb.dao.CursoDao;
import com.marioaliaga.junaeb.dto.Curso;
import com.marioaliaga.junaeb.util.ConeccionMySql;

public class CursoDaoImpl extends ConeccionMySql implements CursoDao {

	private static final Logger logger = LoggerFactory.getLogger(CursoDaoImpl.class);
			
	@Override
	public List<Curso> getCursos() throws SQLException {
		List<Curso> cursos = new ArrayList<Curso>();
		Curso curso = null;
		Connection cn = null;
		ResultSet rs = null;
		Statement st = null;
		
		try {

			logger.info("****************************************");
			logger.info("***   Obteniendo Cursos      ****");
			logger.info("****************************************");

			cn = getConection(); // OBTENEMOS LA CONEIÓN
			String query = "select cu_id, cu_descripcion from curso";

			logger.info(query);

			st = cn.createStatement();
			rs = st.executeQuery(query);

			while(rs.next()){
				curso = new Curso();
				
				curso.setCol_id(rs.getInt("cu_id"));
				curso.setCol_descripcion(rs.getString("cu_descripcion"));
				
				cursos.add(curso);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			st.close();
			cn.close();
		}
		
		return cursos;
	}

}
