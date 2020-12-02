public class Prive extends Compte {
    public Prive(double solde){
        super(solde, 0.01);
    }
    public void afficher(){
        System.out.println("compte prive:\t" + solde + " francs");
    }
}