package fr.unilim.iut.spaceinvaders;
  
public class SpaceInvaders {

int longueur;
int hauteur;

	public SpaceInvaders(int longueur, int hauteur) {
		this.longueur = longueur;
		this.hauteur = hauteur;
	}
	
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < longueur; j++) {
                s += ".";
            }
            s += "\n";
        }
        return s;
    }

}