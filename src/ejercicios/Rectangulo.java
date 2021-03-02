package ejercicios;

public class Rectangulo {
	private double longitud =1.0;
	private double ancho =1.0;
	
	public Rectangulo(double longitud, double ancho) {
		super();
		this.longitud = longitud;
		this.ancho = ancho;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		if (longitud <1 || longitud > 20) {
			this.longitud=1;
		}else {
			this.longitud = longitud;
		}
	}
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	@Override
	public String toString() {
		return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + "]";
	}
	

}
