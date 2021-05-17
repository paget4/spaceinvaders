package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

	int x;
	int y;
	int hauteur;
	int longueur;


    public Vaisseau(int longueur, int hauteur, int x, int y) {
	   this.longueur=longueur;
	   this.hauteur=hauteur;
	   this.x = x;
	   this.y = y;
    }
    
	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0,0);
	}
    
    public void positionner(int x, int y) {
	    this.x = x;
	    this.y = y;
    }
    
    public boolean occupeLaPosition(int x, int y) {
        return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
    }

    private boolean estAbscisseCouverte(int x) {
        return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
    }

    private boolean estOrdonneeCouverte(int y) {
        return (this.y-this.hauteur+1<=y) && (y<=this.y);
    }

    public int abscisseLaPlusADroite() {
        return this.x+this.longueur-1;
    }
	
    public void seDeplacerVersLaDroite() {
	      this.x = this.x + 1 ;
    }
    
    public void seDeplacerVersLaGauche() {
	      this.x = this.x - 1 ;
  }
    
   	public int abscisseLaPlusAGauche() {
        return this.x;
	}
	

}
