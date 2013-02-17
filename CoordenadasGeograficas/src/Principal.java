
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GeoPunto a,b;
		GeoPuntoAlt c,d;
		
		a = new GeoPunto(2.5, 5.6);
		b = new GeoPunto(7.987, 123.876);
		double distancia = a.distancia(b);
		
		System.out.println("coordenadas de GeoPunto a: "+a.toString());
		System.out.println("coordenadas de GeoPunto b: "+b.toString());
		System.out.println("distancia entre los puntos a y b:"+distancia);
		
		c = new GeoPuntoAlt(2.5, 5.6,10);
		d = new GeoPuntoAlt(7.987, 123.876,11);
		double distancia_new = c.distanciaNueva(d);
		
		System.out.println("coordenadas de GeoPunto c: "+c.toStringNueva());
		System.out.println("coordenadas de GeoPunto d: "+d.toStringNueva());
		System.out.println("distancia nueva entre los puntos c y d:"+distancia_new);		
		
	
	}

}
