package pack;

public class Compte_courant extends Compte {
    
    private double plafond=Employe.getSalaire();
    private double fraisDepassementMensuels =0;
    private double fraisBancairesTrimestriels = 20;
public Compte_courant(){
    super();
    
}
public Compte_courant(Employe titulaire,int numero_compte,Agence_bancaire agence,Date date){
    super(titulaire, numero_compte, agence,date);
    
}


public void setPlaf_depasse(double plafond){
    this.plafond=plafond;
}
public void versement(double montant) {
    super.versement(montant);
    // Mise à jour des frais de dépassement
    mettreAJourFraisDepassemen();
}
public void versement() {
    super.versement(Employe.getSalaire());
    // Mise à jour des frais de dépassement
    mettreAJourFraisDepassemen();
}
public void retrait(double montant) {
    super.retrait(montant);
    // if (montant <= solde+plafond ) {
    //     solde -= montant;
    //     System.out.println("Retrait de " + montant + " DT effectué.");
        // Mise à jour des frais de dépassement
        mettreAJourFraisDepassemen();
    // } else {
    //     System.out.println("Solde insuffisant.");
    // }
}
public void fraisBancairesTrimestriels(){
     solde=solde-fraisBancairesTrimestriels;
}
public void fraisDepassementMensuels(){
    solde=solde-fraisDepassementMensuels;
}

private void mettreAJourFraisDepassemen() {
    double depassement = Math.max(0, solde * (-1));
    fraisDepassementMensuels = depassement * 0.02;
    System.out.println("Frais de dépassement mis à jour : " + fraisDepassementMensuels + " DT.");
}
public void affiche() {
    super.affiche();
    System.out.println("Autorisation de dépassement: " + plafond);
    System.out.println("Frais de dépassement mensuels: " + fraisDepassementMensuels);
    System.out.println("Frais bancaires trimestriels: " + fraisBancairesTrimestriels);
}
public String toString(){
    return ("\nCompte Courant"+"Autorisation de dépassement: " + plafond+"\nFrais de dépassement mensuels: " + fraisDepassementMensuels+"\nFrais bancaires trimestriels: " + fraisBancairesTrimestriels+"\n"+super.toString());
}
}





   

