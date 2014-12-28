package JeuCartes;

public abstract class JeuCartes {
	private String nom;
	
	// est ce qu'on garde en public ?
	public abstract void initialiserJeu();

	public abstract void jouerUnTour();

	public abstract void estGagnant();

	public abstract boolean finJeu();

	// boucle principale du jeu

	public final void jouerUnePartie() {
		initialiserJeu();
		while (!finJeu()) {
			jouerUnTour();
		}
		estGagnant();
	}
}
