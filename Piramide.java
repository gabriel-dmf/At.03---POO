package poo_comeco;

public class Piramide {

	private double h;
	private double ab;
	private float tipo;
	
	public double getH() {
		return h;
	}
	public void setH(double h) {
		if(h > 0)
			this.h = h;
	}
	
	public double getAb() {
		return ab;
	}
	public void setAb(double ab) {
		if(ab > 0)
			this.ab = ab;
	}
	
	public float getTipo() {
		return tipo;
	}
	public void setTipo(float tipo) {
		if((tipo > 0) & (tipo <= 3))
			this.tipo = tipo;
	}
	
	
}
