class Banque {
    public static void main(String[] args){
        Client pedro = new Client("Pedro", "Geneve", 1000, 2000);
        Client alexandra = new Client("Alexandra", "Lusanne", 3000, 4000);
        System.out.println("Donnees avant le bouclemenet des comptes");
        pedro.afficher();
        alexandra.afficher();
        pedro.bouclerEpargne();
        pedro.bouclerPrive();
        alexandra.bouclerEpargne();
        alexandra.bouclerPrive();
        System.out.println("donnees apres le bouclement des comptes");
        pedro.afficher();
        alexandra.afficher();
    }
}