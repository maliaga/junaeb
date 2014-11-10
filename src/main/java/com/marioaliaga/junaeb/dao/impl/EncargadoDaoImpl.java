package com.marioaliaga.junaeb.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.marioaliaga.junaeb.dao.EncargadoDao;
import com.marioaliaga.junaeb.util.ConeccionMySql;

public class EncargadoDaoImpl extends ConeccionMySql implements EncargadoDao {

	@Override
	public Boolean validaLogin(String enc_usuario, String enc_password)
			throws Exception {
		Connection cn = null;
		ResultSet rs = null;
		Statement st = null;
		Boolean estado = false;

		try {

			System.out.println("****************************************");
			System.out.println("***   Validado Ingreso USUARIO      ****");
			System.out.println("****************************************");

			cn = getConection(); // OBTENEMOS LA CONEIÓN
			String query = "select * from encargado where enc_password='";
			query += enc_password + "' and enc_usuario='" + enc_usuario
					+ "'";

			System.out.println(query);

			st = cn.createStatement();
			rs = st.executeQuery(query);

			estado = rs.next();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			st.close();
			cn.close();
		}

		return estado;
	}
}
