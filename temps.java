import java.util.ArrayList;

public class temps {
    String nom;
    ArrayList<partie> pr;

    temps(){
        this.nom=null;
        this.pr=new ArrayList<partie>();
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String n){
        this.nom=n;
    }

    public void ajoutpr(partie p){
        this.pr.add(p);
    }
    public ArrayList<partie> getArrayList(){
        return this.pr;
    }
}
