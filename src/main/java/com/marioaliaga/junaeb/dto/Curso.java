package com.marioaliaga.junaeb.dto;

import java.io.Serializable;

public class Curso implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8577284964965652647L;
	private Integer col_id;
	private String col_descripcion;
	
	
	/**
	 * @return the col_id
	 */
	public Integer getCol_id() {
		return col_id;
	}
	/**
	 * @param col_id the col_id to set
	 */
	public void setCol_id(Integer col_id) {
		this.col_id = col_id;
	}
	/**
	 * @return the col_descripcion
	 */
	public String getCol_descripcion() {
		return col_descripcion;
	}
	/**
	 * @param col_descripcion the col_descripcion to set
	 */
	public void setCol_descripcion(String col_descripcion) {
		this.col_descripcion = col_descripcion;
	}
	
	

}
