package co.simplon.poo.s2.volumes;

import co.simplon.poo.s2.surfaces.Rectangle;

public class PaveDroit extends Parallelepipede {

	public PaveDroit(float largeur, float longueur, float hauteur) {
		super(new Rectangle(largeur, longueur), hauteur);
	}
}