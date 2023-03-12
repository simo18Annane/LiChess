

public class partie {
    Joueurs Joueur1;
    Joueurs Joueur2;
    String Event;
    String Site;
    String Resultat;
    String temps;
    Ouverture open;
    int compteur;
    

    partie(Joueurs joueur1, Joueurs joueur2) {
        this.Joueur1 = joueur1;
        this.Joueur2 = joueur2;
    }

    partie(){
        this.Event= "";
        this.Joueur1=new Joueurs();
        this.Joueur2=new Joueurs();
        this.Site="";
        this.Resultat="";
        this.temps="";
        this.open=new Ouverture();
        this.compteur=0;
    }

    public Joueurs getJoueurs1() {
        return this.Joueur1;
    }

    public Joueurs getJoueurs2() {
        return this.Joueur2;
    }

    public String getEvent(){
        return this.Event;
    }
    public void setEvent(String nom){
        this.Event=nom;
    }
    public String getSite(){
        return this.Site;
    }
    public void setSite(String nom){
        this.Site=nom;
    }

    public void setJoueurs1(Joueurs j){
        this.Joueur1=j;
    }
    public void setJoueurs2(Joueurs j){
        this.Joueur2=j;
    }

    public String getResultat(){
        return this.Resultat;
    }
    public void setResultat(String nom){
        this.Resultat=nom;
    }

    public String getTemps(){
        return this.temps;
    }
    public void setTemps(String nom){
        this.temps=nom;
    }

    public Ouverture getOpen(){
        return this.open;
    }
    public void setOpen(Ouverture o){
        this.open=o;
    }
     public void setCompteur(int c){
         this.compteur=c;
     }
     public int getCompteur(){
         return this.compteur; 
     }
    public String toString(){
      return "Event :"+this.getEvent()+" \nSite :"+this.getSite()+" \nJoueur 1 :"+this.getJoueurs1().toString()+" \nJoueur 2:"+this.getJoueurs2().toString()+" \nResultat :"+this.getResultat()+" \nOuverture :"+this.getOpen().toString()+" \nTemps :"+this.getTemps();
    }

}
