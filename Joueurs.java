import java.util.ArrayList;

public class Joueurs {
    String Name;
    ArrayList<partie> Parties;

    Joueurs(String Name) {
        this.Name = Name;
    }
    public Joueurs(){
        this.Name=null;
        this.Parties=new ArrayList<partie>();
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String nom){
        this.Name=nom;
    }

    public void ajoutPartie(partie p){
        this.Parties.add(p);
    }
    public ArrayList<partie> getArrayList(){
        return this.Parties;
    }
    public String toString(){
        return ""+ this.getName();
    }

}
