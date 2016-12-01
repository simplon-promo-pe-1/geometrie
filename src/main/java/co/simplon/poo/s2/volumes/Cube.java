package co.simplon.poo.s2.volumes;

import co.simplon.poo.s2.surfaces.Carre;

public class Cube extends Parallelepipede {

	public Cube(float dimension) {
		super(new Carre(dimension), dimension);
	}

}
