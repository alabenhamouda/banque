public class Epargne extends Compte {
    public Epargne(double solde){
        super(solde, 0.02);
    }
    public void afficher(){
        System.out.println("Compte epargne:\t" + solde + " francs");
    }
}