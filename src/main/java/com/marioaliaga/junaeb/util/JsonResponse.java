package com.marioaliaga.junaeb.util;

import java.io.Serializable;

public class JsonResponse implements Serializable {
	
	private static final long serialVersionUID = 4776919619627439711L;
	private Boolean success = false;
	private Object body = "empty";
	private String mensaje = null;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensajes) {
		this.mensaje = mensajes;
	}

	private String urlRedirect = null;

	public JsonResponse() {
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccessToTrue() {
		success = true;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public void setUrlRedirect(String urlRedirect) {
		this.urlRedirect = urlRedirect;
	}

	public String getUrlRedirect() {
		return urlRedirect;
	}

}
