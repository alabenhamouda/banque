class Client {
    private final String nom;
    private String ville;
    private Prive prive;
    private Epargne epargne;
    public Client(String nom, String ville, double soldePrive, double soldeEpargne){
        this.nom = nom;
        this.ville = ville;
        prive = new Prive(soldePrive);
        epargne = new Epargne(soldeEpargne);
    }
    public void bouclerPrive() { prive.boucler(); }
    public void bouclerEpargne() { epargne.boucler(); }
    public void afficher(){
        System.out.println("Client " + nom + " de " + ville);
        prive.afficher();
        epargne.afficher();
    }
}