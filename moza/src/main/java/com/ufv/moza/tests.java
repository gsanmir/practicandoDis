package com.ufv.moza;

import static org.junit.Assert.*;

import org.junit.Test;

public class tests {

	@Test
	public void instanciarUsuario() {
		Alumno u = new Alumno("guillermo", "san miguel", 19);
		assertEquals(u.getName(),"guillermo");
	}

	@Test
	public void addAlumno() {
		Alumno u = new Alumno();
		Lista lista = new Lista();
		lista.addAlumno(u);
		assertEquals(1 , lista.getListSize());
	}

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/


}
