package com.ufv.moza;

public class Alumno {
	private String name;
	private String apellido;
	private int edad;
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	public Alumno(String name, String apellido, int edad) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.apellido= apellido;
		this.edad=edad;
	}
	public void aniadirAlumno() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean isMayor() {
		return edad >= 18;
	}
}
