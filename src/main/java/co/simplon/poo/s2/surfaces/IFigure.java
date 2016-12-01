package co.simplon.poo.s2.surfaces;

public interface IFigure {

	/**
	 * Détermine le périmètre de la figure en cm
	 * 
	 * @return une valeur positive flottant représentant un périmètre en cm
	 */
	float calculerPerimetre();
	
	float calculerSurface();
}