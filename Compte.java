abstract class Compte {
    protected double solde;
    protected final double taux;
    public Compte(double solde, double taux){
        this.solde = solde;
        this.taux = taux;
    }
    public abstract void afficher();
    public void boucler(){
        double interets = taux * solde;
        solde += interets;
    } 
}