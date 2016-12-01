package co.simplon.poo.s2.surfaces;

public class Rectangle extends Quadrilatere {

	public Rectangle(float coteLargeur, float coteLongueur) {
		super(coteLargeur, coteLargeur, coteLongueur, coteLongueur);
	}

	public float calculerSurface() {
		return this.coteA * this.coteC;
	}
}
