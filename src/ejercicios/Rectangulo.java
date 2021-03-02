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
	public double getPerimetro(double longitud, double ancho) {
		double perimetro= (2*this.longitud + 2*this.ancho);
		return perimetro;
	}
	public double getArea(double ancho, double longitud) {
		double area = 2*(this.ancho + this.longitud);
		return area;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ancho);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		if (Double.doubleToLongBits(ancho) != Double.doubleToLongBits(other.ancho))
			return false;
		if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + "]";
	}
	

}
