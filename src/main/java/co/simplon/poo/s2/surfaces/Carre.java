package co.simplon.poo.s2.surfaces;

public class Carre extends Losange {

	public Carre(float cote) {
		super(cote);
	}

	public float calculerSurface() {
		return this.coteA * this.coteA;
	}
}
