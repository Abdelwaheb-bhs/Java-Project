package pack;

public class Credit {
    private Employe titulaire;
    private int code;
    private Compte_courant compte;
    private Date dateversement;
    private double montant;

    public Credit() {
        titulaire =new Employe();
        code = 0;
        compte = new Compte_courant();
        dateversement = new Date();
        montant = 0;
    }

    public Credit(Employe titulaire,int code, Compte_courant compte, Date dateversement, double montant) {
        this.titulaire=titulaire;
        this.code = code;
        this.compte = compte;
        this.dateversement = dateversement;
        this.montant = montant;
    }
    public void affiche() {
        System.out.println("titulaire: " + titulaire.toString());
        System.out.println("Code du crédit : " + code);
        System.out.println("Compte Courant associé : " + compte.getNumero_compte());
        System.out.println("Date de versement : " + dateversement.toString());
        System.out.println("Montant du crédit : " + montant + " DT");
        afficheFraisDossier();
    }
    public String toString(){
        return ("\n Code du crédit : "+code+" \n Numéro de compte courant :"+compte.getNumero_compte()
        + "\n Montant : "+montant+"DT" );
    }

    public boolean autorise_credit() {
        boolean autorise = false;
        if (titulaire.getSituation()=="titulaire"&&(montant<=Employe.getSalaire()*5)&&(compte.getDate_creation().getMonth()>6)) {
            autorise=true;
            System.out.println("credit autorisé");
            }else System.out.println("credit nom autorisé");
         return autorise;

    }
    public void alimenter(){
        if (autorise_credit()) {
            compte.solde=compte.solde+montant;
            
        }}
    public void verserfraisDossier() {
        if (autorise_credit()) {
            double fraisDossier = fraisDossier();
            
            
            if (compte.solde >= montant + fraisDossier) {
                compte.retrait(montant + fraisDossier);
                System.out.println("Versement du crédit de " + montant + " DT effectué avec des frais de dossier de " + fraisDossier + " DT.");
            } else {
                System.out.println("Solde insuffisant pour effectuer le versement du crédit.");
            }
        } else {
            System.out.println("Le titulaire n'est pas éligible au crédit.");
        }
    }

    public void afficheFraisDossier() {
        double fraisDossier = fraisDossier();
        System.out.println("Frais de dossier : " + fraisDossier + " DT");
    }
    public double fraisDossier() {
        int ageTitulaire = titulaire.calculerAge();

        
        if (ageTitulaire < 30) {
            return 0.01 * montant;
        } else if (ageTitulaire >= 30 && ageTitulaire <= 50) {
            return 0.02 * montant;
        } else {
            return 0.03 * montant;
        }
    }

    
}







    








    