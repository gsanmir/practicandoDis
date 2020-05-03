package com.ufv.moza;

import java.util.ArrayList;

public class Lista {
	private ArrayList<Alumno> alumnos;
	public Lista() {
		// TODO Auto-generated constructor stub
		alumnos = new  ArrayList<Alumno>();
	}
	public void addAlumno(Alumno a) {
		alumnos.add(a);
	}
	public int getListSize() {
		return alumnos.size();
	}
		

}
