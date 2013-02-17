/**
 * 
 */
package org.example.asteroides;

import java.util.Vector;

/**
 * @author migue
 * 
 */
public class AlmacenPuntuacionesArray implements AlmacenPuntuaciones {

	private Vector<String> puntuaciones;

	public AlmacenPuntuacionesArray() {
		puntuaciones = new Vector<String>();
		puntuaciones.add("123000 Pepito Domingez");
		puntuaciones.add("111000 Pedro Martinez");
		puntuaciones.add("011000 Paco PŽrez");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.example.asteroides.AlmacenPuntuaciones#guardarPuntuacion(int,
	 * java.lang.String, long)
	 */
	@Override
	public void guardarPuntuacion(int puntos, String nombre, long fecha) {
        puntuaciones.add(0, puntos + " "+ nombre);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.example.asteroides.AlmacenPuntuaciones#listaPuntuaciones(int)
	 */
	@Override
	public Vector<String> listaPuntuaciones(int cantidad) {
		return puntuaciones;
	}

	/**
	 * @return the puntuaciones
	 */
	public Vector<String> getPuntuaciones() {
		return puntuaciones;
	}

	/**
	 * @param puntuaciones
	 *            the puntuaciones to set
	 */
	public void setPuntuaciones(Vector<String> puntuaciones) {
		this.puntuaciones = puntuaciones;
	}

}
