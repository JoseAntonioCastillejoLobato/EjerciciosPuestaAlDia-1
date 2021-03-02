package ejercicios;

public class Cuenta {
	private double saldo;
	private int ncc;
	private int numIngresos;
	private int numReintegro;

	public Cuenta(int ncc) {
		super();
		this.ncc = ncc;
	}
	public Cuenta(int ncc, double saldo) throws Exception {
		super();
		if (saldo < 0) {
			throw new Exception("mal");
		}else{
		
		this.saldo = saldo;
		this.numIngresos=1;
		}
		this.ncc = ncc;
	}
	public void reintegro(double cantidad) {
		saldo = saldo - cantidad;
		this.numReintegro++;
	}
	public void ingreso(double cantidad) {
		saldo = saldo + cantidad;
		this.numIngresos++;
	}

	public double getSaldo() {
		
			return saldo;
		
		}
		


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ncc);
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
		Cuenta other = (Cuenta) obj;
		if (Double.doubleToLongBits(ncc) != Double.doubleToLongBits(other.ncc))
			return false;
		return true;
	}
	public double getNcc() {
		return ncc;
	}


	}



