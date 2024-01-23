package pack;

public class Compte_epargne extends Compte{
private final double tauxInteretTrimestriel = 0.06;

public Compte_epargne() {
        super();
    }
// public Compte_epargne(Employe p1,int numero_compte,Agence_bancaire agence,Date date_creation){
//         super(p1, numero_compte, agence, date_creation);
//     }
public Compte_epargne(Employe titulaire,int numero_compte,Agence_bancaire agence,Date date){
        super(titulaire, numero_compte, agence,date);
        
    }
public void benefice(){
        solde=(solde*(tauxInteretTrimestriel+1));
 }

   
public void versement(double montant){
    super.versement(montant);
}
public void retrait(double montant){
    super .retrait(montant);
}




















}
