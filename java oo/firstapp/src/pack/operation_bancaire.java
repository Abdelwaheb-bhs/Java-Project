// package pack;

// public class operation_bancaire extends Datetime {
//     private Datetime operation_time;
//     private String type_operation;
//     private double montant;
//     private Agence_bancaire agence;
// public operation_bancaire(){
//     operation_time=new Datetime();
//     this.type_operation="";
//     this.montant=0;
//     agence=new Agence_bancaire();
// }
// public operation_bancaire(Datetime operation_time,String type_operation,double montant,Agence_bancaire agence){
//     this.operation_time=operation_time;
//     this.type_operation=type_operation;
//     this.montant=montant;
//     this.agence=agence;
    

// }
// public void setOperationTime(Datetime date){
//     this.operation_time=date;
// }
// public void setOperationTime(Date date){
//     this.setYear(date.getYear());
//     this.setMonth(date.getMonth());
//     this.setDay(date.getDay());
// }

// public Datetime getOperationTime(){
//     return this.operation_time;
// }
// public void setTypeOperation(String tp){
//     this.type_operation=tp;
//     }
//     public String getTypeOperation(){
//         return this.type_operation;
//         }
//         public void setMontant(double mnt){
//             this.montant=mnt;
//             }
//             public double getMontant(){
//                 return this.montant;
//                 }
//                 public void setAgenceBancaire(Agence_bancaire a){
//                     this.agence.setNom_agence(a.getNom_banque());
//                 }
//                 public Agence_bancaire getAgenceBancaire(){
//                     return this.agence;
//                     }
//                 public String toString(){
//                     return "\nLe date "+operation_time.toString()+"\ntype operation "+type_operation+"\nmontant "+montant+"\n agence"+agence.toString();
//                 }


// }

package pack;

public class operation_bancaire extends Datetime {
    private Datetime operation_time;
    private String type_operation;
    private double montant;
    private Agence_bancaire agence;

    public operation_bancaire() {
        operation_time = new Datetime();
        this.type_operation = "";
        this.montant = 0;
        agence = new Agence_bancaire();
    }

    public operation_bancaire(Datetime operation_time, String type_operation, double montant, Agence_bancaire agence) {
        this.operation_time = operation_time;
        this.type_operation = type_operation;
        this.montant = montant;
        this.agence = agence;
    }

    public void setOperationTime(Datetime date) {
        this.operation_time = date;
    }

    public void setOperationTime(Date date) {
        this.setYear(date.getYear());
        this.setMonth(date.getMonth());
        this.setDay(date.getDay());
    }

    public Datetime getOperationTime() {
        return this.operation_time;
    }

    public void setTypeOperation(String tp) {
        this.type_operation = tp;
    }

    public String getTypeOperation() {
        return this.type_operation;
    }

    public void setMontant(double mnt) {
        this.montant = mnt;
    }

    public double getMontant() {
        return this.montant;
    }

    public void setAgenceBancaire(Agence_bancaire a) {
        this.agence = a;
    }

    public Agence_bancaire getAgenceBancaire() {
        return this.agence;
    }

    // Add a method to get the address
    public String getAddress() {
        return agence.getAddresee();  // Assuming Agence_bancaire has a getAdresse() method
    }

    public String toString() {
        return "\nLe date " + operation_time.toString() + "\ntype operation " + type_operation + "\nmontant " + montant
                + "\n agence " + agence.toString();
    }
}
