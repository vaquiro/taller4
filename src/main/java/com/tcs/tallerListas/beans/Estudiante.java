package com.tcs.tallerListas.beans;

public class Estudiante {

	private String identificacion;
	private String nombre;
	private String edad;
	private String gradoCursar;
	private String repite;

	public Estudiante(String identificacion, String nombre, String edad, String gradoCursar, String repite) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = edad;
		this.gradoCursar = gradoCursar;
		this.repite = repite;
	}



	public Estudiante(String nombre, String gradoCursar) {
		super();
		this.nombre = nombre;
		this.gradoCursar = gradoCursar;
	}



	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getGradoCursar() {
		return gradoCursar;
	}

	public void setGradoCursar(String gradoCursar) {
		this.gradoCursar = gradoCursar;
	}
	
	public String getRepite() {
		return repite;
	}



	public void setRepite(String repite) {
		this.repite = repite;
	}

}
