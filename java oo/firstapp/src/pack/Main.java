package pack;
public class Main {
  public static void main(String[] args){
    Personne p1=new Personne("tounsi", "salem", 12345678, 13, 5, 1982);
    Date dembauche =new Date(1, 3, 2018);
    Date act=new Date(1, 1, 2022);
    Employe employe=new Employe("developpeur", act, dembauche, 1500, p1);
    Agence_bancaire AGENCE =new Agence_bancaire(24, "biat", "sfax", 25, 12, 2015);
    Compte_courant cc=new Compte_courant(employe, 12854, AGENCE, act);
    Compte_epargne ce=new Compte_epargne(employe, 95147, AGENCE, act);
    act.affiche();
     for(int i=1;i<=12;i++){
      act.setMonth(i);
      act.affiche();
      employe.Salaire();
      cc.versement();
      ce.versement(500);
      cc.retrait(350);
      cc.fraisDepassementMensuels();
       switch(act.getMonth()){
         case 4,7,10:
         cc.fraisbanq();
         cc.fraisBancairesTrimestriels();
         ce.benefice();
         ce.fraisbanq();
        cc.fraisDepassementMensuels();
       break;
       }
     }act.setYear(act.getYear()+1);
     act.setMonth(act.getMonth()-11);
     System.out.println(act.toString());
      Credit credit=new Credit(employe, 6699, cc, act, 4500);
      credit.alimenter();
      cc.retrait(credit.fraisDossier());
       for(int i=1;i<=12;i++){
        act.setMonth(i);
        act.affiche();
       employe.Salaire();
         cc.versement();
        cc.retrait(400);
                 cc.retrait(400);
         cc.fraisDepassementMensuels();
      switch(act.getMonth()){case 3,5,7,9,11 :ce.retrait(300);}
       switch(act.getMonth()){
       case 1,4,7,10:
       cc.fraisbanq();
       cc.fraisBancairesTrimestriels();
       ce.benefice();
      break;
     }
     cc.affiche();
     ce.affiche();
     System.out.println(cc.solde);
     System.out.println(ce.solde);
     }
      cc.extraitBancaires();
      ce.extraitBancaires();
  }
 }




   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  
 
  

    
    
  
