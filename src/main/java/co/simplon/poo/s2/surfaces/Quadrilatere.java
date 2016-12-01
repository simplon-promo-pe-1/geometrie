package co.simplon.poo.s2.surfaces;

/**
 * Définition commune pour l'ensemble des figures ayant 4 côtés
 * 
 * @author esiber
 *
 */
public class Quadrilatere extends Figure implements IFigure {

	protected float coteA, coteB, coteC, coteD;

	public Quadrilatere(float coteA, float coteB, float coteC, float coteD) {
		super(4);
		if (coteD <= 0 || coteA <= 0 || coteB <= 0 || coteC <= 0)
			throw new IllegalArgumentException("La cote doit être strictement positive.");
		this.coteA = coteA;
		this.coteB = coteB;
		this.coteC = coteC;
		this.coteD = coteD;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.simplon.poo.s2.Figure#calculerPerimetre()
	 */
	@Override
	public float calculerPerimetre() {
		return this.coteA + this.coteB + this.coteC + this.coteD;
	}

	@Override
	public float calculerSurface() {
		throw new UnsupportedOperationException("Non implémenté");
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Quadrilatere [nbDeCotes=" + nbDeCotes + "]";
	}

}
