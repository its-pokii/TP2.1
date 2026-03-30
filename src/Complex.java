public class Complex {
    private float reel ;
    private float  imaginaire ;


    public float getReel(){
        return this.reel;
    }
    public float getImaginaire(){
        return this.reel;
    }
    public void setReel(float x){
        this.reel=x;
    }
    public void setImaginaire(float y){
        this.imaginaire=y;
    }
    public Complex(){
        this.reel = 0;
        this.imaginaire = 0;
    }
    public Complex(float x,float y){
        this.reel = x;
        this.imaginaire = y;
    }
    public void PlusComplex(Complex b ){
        float  c = this.reel + b.reel ;
        float d = this.imaginaire + b.imaginaire ;
        System.out.println("La somme des deux nombres complex est : "+c+"+"+d+"i");
    }
    public void MoinComplex(Complex a ,Complex b ){
        float  c = a.reel - b.reel ;
        float d = a.imaginaire - b.imaginaire ;
        System.out.println("La diffirence  des deux nombres complex est : "+c+"+"+d+"i");
    }
    public void afficherComplex(){
        System.out.println("L�ecriture complex est :"+this.reel+"+"+this.imaginaire+"i");
    }

}