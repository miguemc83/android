/**
 * 
 */

/**
 * @author migue
 *
 */
public class GeoPuntoAlt extends GeoPunto {

	// Altura del GeoPunto
	private double altura;

	public GeoPuntoAlt(double _longitud, double _latitud, double _altura) {
		super(_longitud, _latitud);
		this.altura = _altura;
	}

	public GeoPuntoAlt(double _longitud, double _latitud) {
		super(_longitud, _latitud);
		this.altura = 0;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Recupera la distancia entre dos GeoPuntoAlt
	 * @param punto
	 * @return double: distancia
	 */
	public double distanciaNueva(GeoPuntoAlt punto) {
		double r;
		double distancia = super.distancia(punto);
		double diferencia_alturas = this.getAltura() - punto.getAltura();
		r = Math.sqrt(Math.pow(distancia, 2) + Math.pow(diferencia_alturas, 2));
		return r;
	}

	public String toStringNueva() {
		return super.toString() + ", altura: " + this.getAltura();
	}
}
