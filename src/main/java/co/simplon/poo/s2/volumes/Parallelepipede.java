package co.simplon.poo.s2.volumes;

import co.simplon.poo.s2.surfaces.Quadrilatere;

public abstract class Parallelepipede implements Volume {

	protected Quadrilatere base;
	protected float hauteur;
	
	public Parallelepipede(Quadrilatere base, float hauteur) {
		if (hauteur < 0) {
			throw new IllegalArgumentException("La hauteur doit être positive.");
		}
		this.base = base;
		this.hauteur = hauteur;
	}

	/* (non-Javadoc)
	 * @see co.simplon.poo.s2.Volume#calculerContenance()
	 */
	@Override
	public float calculerContenance() {
		return this.base.calculerSurface() * this.hauteur;
	}

}
