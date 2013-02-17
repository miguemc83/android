package org.example.asteroides;

import java.util.Vector;

/**
 * @author migue
 *
 */
public interface AlmacenPuntuaciones {
	public void guardarPuntuacion(int puntos, String nombre, long fecha);

	public Vector<String> listaPuntuaciones(int cantidad);

}
