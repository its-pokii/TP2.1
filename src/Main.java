
public class Main {
    public static void main(String[] args){
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();
        rec1.setLargeur(10);
        rec1.setLongueur(10);

        rec2.setLargeur(20);
        rec2.setLongueur(10);

        rec1.afficherRectangle();
        rec2.afficherRectangle();


        Complex a = new Complex(3,5);
        Complex b = new Complex(2,1);
        a.afficherComplex();
        b.afficherComplex();
        a.PlusComplex(b);

    }
}