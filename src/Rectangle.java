public class Rectangle {
    int longueur;
    int largeur;

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int perimetre() {
        return 2 * (this.longueur + this.largeur);
    }

    public int aire() {
        return this.longueur * this.largeur;
    }

    public boolean estCarre() {
        if (this.largeur == this.longueur) {
            return true;
        } else return false;
    }

    public void afficherRectangle() {
        System.out.println("Longueur = " + this.longueur);
        System.out.println("Largeur = " + this.largeur);
        System.out.println("Perimetre = " + this.perimetre());
        System.out.println("Aire = " + this.aire());
        if (estCarre()) {
            System.out.println("c'est un carre ");
        } else System.out.println("un rectangle normal");
    }
}
