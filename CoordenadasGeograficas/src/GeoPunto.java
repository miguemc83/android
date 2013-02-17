
public class GeoPunto {

	//atributo longitud
	protected double longitud;
	
	//atributo latitud
	protected double latitud;
	
	//Constante de radio de la tierra en metros
	final static double RADIO_TIERRA = 6371000;
	
	/**
	 * Constructor de la clase
	 * @param _longitud
	 * @param _latitud
	 */
	public GeoPunto(double _longitud, double _latitud) {
		this.setLongitud((int) (_longitud * 1E6));
		this.setLatitud((int) (_latitud * 1E6));
	}
	
	/**
	 * Devuelve una cadena con la longitud y latitud de un objeto GeoPunto
	 */
	public String toString() {
		return new String("longitud: " + this.getLongitud() + ", latitud: " + this.getLatitud());
	}
	
	/**
	 * devuelve la distancia entre dos objetos GeoPunto
	 * @param punto
	 * @return
	 */
	public double distancia (GeoPunto punto) {
		double dLat = Math.toRadians(latitud - punto.latitud);
		double dLon = Math.toRadians(longitud - punto.longitud);
		double lat1 = Math.toRadians(punto.latitud);
		double lat2 = Math.toRadians(latitud);
		double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
		Math.sin(dLon/2) * Math.sin(dLon/2) *
		Math.cos(lat1) * Math.cos(lat2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		return c * RADIO_TIERRA;
	}
	
	/**
	 * Recupera la longitud
	 * @return double: longitud
	 */
	public double getLongitud() {
		return longitud;
	}
	
	/**
	 * Establece la longitud
	 * @param longitud
	 */
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	/**
	 * Recupera la latitud
	 * @return double: latitud
	 */
	public double getLatitud() {
		return latitud;
	}
	
	/**
	 * Establece la latitud
	 * @param latitud
	 */
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	
	
	
	
}
