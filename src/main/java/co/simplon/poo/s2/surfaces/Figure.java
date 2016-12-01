package co.simplon.poo.s2.surfaces;


/**
 * Définition commune à l'ensemble des figure planes gérées par le système
 * 
 * @author esiber
 *
 */
public abstract class Figure extends Object {
	protected int nbDeCotes;

	/**
	 * Constructeur
	 * 
	 * @param nbDeCotes
	 *            Nombre de côtés de la figure
	 */
	public Figure(int nbDeCotes) {
		super();
		this.nbDeCotes = nbDeCotes;
	}
	
}
