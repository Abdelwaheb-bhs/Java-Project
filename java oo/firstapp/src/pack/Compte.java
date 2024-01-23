package pack;

public class Compte {
    protected Employe titulaire;
    protected int numero_compte;
    protected double solde;
    protected Agence_bancaire agence;
    protected Date date_creation;
    protected static double frais=15 ;
    private operation_bancaire[] operations;
    
    

public Compte(){
     titulaire=new Employe();
    numero_compte=0;
    solde=0.0;
     agence=new Agence_bancaire();
     date_creation= new Date();
     this.operations = new operation_bancaire[60];
         for (int i = 0; i < 60; i++) {
             this.operations[i] = new operation_bancaire();
        }
 }
public Compte(Employe p1,int numero_compte,Agence_bancaire agence,Date date_creation){
    titulaire =p1;
    this.numero_compte=numero_compte;
    this.agence=agence;
    this.date_creation=date_creation;
    this.operations = new operation_bancaire[60];
        for (int i = 0; i < 60; i++) {
            this.operations[i] = new operation_bancaire();
        }
   
}
public Compte(Employe p1,int numero_compte,Agence_bancaire agence,int day,int month,int year){
    titulaire =p1;
    this.numero_compte=numero_compte;
    this.agence=agence;
    this.date_creation.setDay(day);
    this.date_creation.setMonth(month);
    this.date_creation.setYear(year);
    this.operations = new operation_bancaire[60];
        for (int i = 0; i < 60; i++) {
            this.operations[i] = new operation_bancaire();
        }
   
}

public void affiche(){
    System.out.println("Titulaire : "+titulaire+" numero_compte "+numero_compte+"\nsolde :"+solde+"\nagence :"+agence+" date creation de compte :"+date_creation);
}
public String toString() {
    return "Compte de "+titulaire+" Numéro: "+numero_compte+", Solde: "+solde +"\nagence :"+agence+" date creation de compte :"+date_creation;
}
public Employe getTitulaire(){
    return titulaire;
}
public int getNumero_compte(){
    return numero_compte;
}
public void afficheSold(){
    System.out.println("le solde = "+solde);
}
// public void versement(double montant){
//     solde=solde+montant;
//     System.out.println("Versement de " + montant + " DT effectué.");
// }
public void versement(double montant) {
    // chouf blasa fer8a 
    int index = findEmptySlot();

    if (index != -1) {
        this.operations[index].setOperationTime(date_creation);
        this.operations[index].setTypeOperation(" debit");
        this.operations[index].setMontant(montant);
        this.operations[index].setAgenceBancaire(agence);
        solde += montant;  
        System.out.println("Versement de " + montant + " DT effectué.");
    } else {solde += montant;  
        System.out.println("Opération impossible, tableau des opérations plein.");
    }
}
public void Versement() {
    // chouf blasa fer8a 
    int index = findEmptySlot();

    if (index != -1) {
        this.operations[index].setOperationTime(date_creation);
        this.operations[index].setTypeOperation(" debit");
        this.operations[index].setMontant(Employe.getSalaire());
        this.operations[index].setAgenceBancaire(agence);
        solde += Employe.getSalaire();  
        System.out.println("Versement de " + Employe.getSalaire() + " DT effectué.");
    } else { solde += Employe.getSalaire();  
        System.out.println("Opération impossible, tableau des opérations plein.");
    }
}


// public void versement(){
//     solde=solde+Employe.getSalaire();
//     System.out.println("Versement de " + Employe.getSalaire() + " DT effectué.");
// }

// public void retrait(double montant) {
//     if (montant <= (solde+Employe.getSalaire())) {
//         solde -= montant;
//         System.out.println("Retrait de " + montant + " DT effectué.");
//     } else {
//         System.out.println("Solde insuffisant.");
//     }
// }
public void retrait(double montant) {
    
    int index = findEmptySlot();

    if (index != -1 && montant <= (solde + Employe.getSalaire())) {
        this.operations[index].setOperationTime(date_creation);
        this.operations[index].setTypeOperation("credit");
        this.operations[index].setMontant(montant);
        this.operations[index].setAgenceBancaire(agence);
        solde -= montant;  
        System.out.println("Retrait de " + montant + " DT effectué.");
    } else if (index == -1) {
        System.out.println("Opération impossible, tableau des opérations plein.");
    } else {
        System.out.println("Solde insuffisant.");
    }
}
public Date getDate_creation(){
    return date_creation;
}
public void fraisbanq(){
      int index = findEmptySlot();

    if (index != -1 && frais <= (solde + Employe.getSalaire())) {
        this.operations[index].setOperationTime(date_creation);
        this.operations[index].setTypeOperation("credit");
        this.operations[index].setMontant(frais);
        this.operations[index].setAgenceBancaire(agence);
        solde -= frais;  
        System.out.println("Retrait de " + frais + " DT effectué.");
    } else if (index == -1) {
        System.out.println("Opération impossible, tableau des opérations plein.");
    } else {
        System.out.println("Solde insuffisant.");
    }

}
// public void extraitBancaires() {
//     if (this.operations != null) {
//         for (int i = 0; i < this.operations.length; i++) {
//              System.out.println("Transaction " + (i + 1) + ":");
//              System.out.println("Date: " + this.operations[i].toString());
//             //  System.out.println("Type: " + this.operations[i].toString());
//             //  System.out.println("Montant: " + this.operations[i].toString());
//             // System.out.println("Agence: " + this.operations[i].toString());
//         }
//     } else {
//         System.out.println("Aucune opération disponible.");
//     }
// }
//  public operation_bancaire[] getOperation(){
//     return operations;
//      }
public void extraitBancaires() {
    if (this.operations != null) {
        for (int i = 0; i < this.operations.length; i++) {
            System.out.println("Transaction " + (i + 1) + ":");
            System.out.println("Date: " + date_creation.toString());
            System.out.println("Type: " + this.operations[i].getTypeOperation());
            System.out.println("Montant: " + this.operations[i].getMontant());
            System.out.println("Agence: " + this.operations[i].getAgenceBancaire().getNom_banque());
            System.out.println("Adresse: " + this.operations[i].getAddress());  
        }
    } else {
        System.out.println("Aucune opération disponible.");
    }
}

     public int findEmptySlot() {
        for (int i = 0; i < this.operations.length; i++) {
            if (this.operations[i].getTypeOperation() == "") {
                return i;
            }
        }
        return -1;  // mfamech blasa 
    }
    public double getSolde(){
        return solde;
    }
public operation_bancaire[] getOperations(){
    return operations;
}

    }
 












































