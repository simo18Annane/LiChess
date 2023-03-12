public class Ouverture {
    String nom;

    Ouverture(){
        this.nom=null;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }

    public String toString(){
        return ""+this.getNom();
    }
}
