import java.io.*;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class page2 {
    private File file = null;
    private FileReader reader = null;
    private BufferedReader read = null;
    private StringTokenizer st = null;
    private Hashtable<String,ArrayList<partie>> th;
    private Hashtable<String,Integer> open;
    private ArrayList<partie>pr;
    
    

    public page2() throws FileNotFoundException {
        file = new File("test.txt");
        reader = new FileReader(file);
        read = new BufferedReader(reader);//a changer
        this.th =new Hashtable<>();
        this.open=new Hashtable<>();
        this.pr=new ArrayList<>();
        
    
    }
    public BufferedReader getBuffer(){
        return this.read;
    }

    public void sortValue(Hashtable<?, Integer> t)throws IOException{
        ArrayList<Map.Entry<?, Integer>> l=new ArrayList(t.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<?, Integer>>(){
            public int compare(Map.Entry<?, Integer> o1, Map.Entry<?, Integer> o2){
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for(int i=l.size()-1;i>l.size()-6;i--){
            System.out.println(l.get(i));}
           
    }
    

   
    

    public void essayer() throws IOException{
        String line;
        partie p = null;
        while ((line = getBuffer().readLine())!=null) {
            this.st = new StringTokenizer(line, " ,;[]()\n");
            while(st.hasMoreTokens()) {
                String parcourir = st.nextToken();
                if(parcourir.equals("Event")) {
                    p = new partie();
                    this.pr.add(p);
                    p.setEvent(st.nextToken("]"));
                } 
                if(parcourir.equals("Site")) {
                    p.setSite(st.nextToken("]"));
                } 
                if(parcourir.equals("White")) {
                    String m=st.nextToken("]");
                    if(this.th.containsKey(m)){
                        p.getJoueurs1().setName(m);
                        this.th.get(m).add(p);
                    }else{
                       p.getJoueurs1().setName(m);
                       p.getJoueurs1().ajoutPartie(p);
                       this.th.put(p.getJoueurs1().getName(), p.getJoueurs1().getArrayList() );}
                } 
                if(parcourir.equals("Black")) {
                    String m=st.nextToken("]");
                    if(this.th.containsKey(m)){
                        p.getJoueurs2().setName(m);
                        this.th.get(m).add(p);
                    }else{
                       p.getJoueurs2().setName(m);
                       p.getJoueurs2().ajoutPartie(p);
                       this.th.put(p.getJoueurs2().getName(), p.getJoueurs2().getArrayList());}
                } 
                if(parcourir.equals("Result")) {
                    p.setResultat(st.nextToken("]"));
                } 
                if(parcourir.equals("Opening")) {
                    
                    String m=st.nextToken("]");
                    p.getOpen().setNom(m);
                    if(this.open.containsKey(m)){
                        int n=this.open.get(m);
                        this.open.put(m,n+1);
                    }
                    else{
                        this.open.put(m,1);
                    }
                } 
                if(parcourir.equals("TimeControl")) {
                    p.setTemps(st.nextToken("]"));
                    //System.out.println(p.toString());
                }
                if(parcourir.equals("1")){
                    for(int i=0;i<100;i++){
                        String m=st.nextToken(".");
                        p.setCompteur(p.getCompteur()+1);

                        }
                    }
                }
            }

    
/*for(String i : this.th.keySet()){
    System.out.println(""+th.get(i).toString() + "\n");
}*/

for(int i=0;i<this.th.get(" \"amirmahdi\"").size();i++){
    System.out.println(th.get(" \"amirmahdi\"").get(i).toString()+"\n");}
/*
    sortValue(this.open);
   System.out.println("la partie la plus courte est: ");
    int res=0;
    int nb=0;
    for(int i=0;i<this.pr.size();i++){
        if(i==0){
            res=this.pr.get(i).getCompteur();
        }
        else{
            if(this.pr.get(i).getCompteur()<res){
                res=this.pr.get(i).getCompteur();
                nb=i;
            }
        }

    }
    System.out.println(this.pr.get(nb).toString());
   
*/





/*
public void afficher(String Nom){
    for(int i=0;i<this.th.get(Nom).size();i++){
       System.out.println(th.get(Nom).get(i).toString()+"\n");}
}
/*
public static void main(String[] args) throws IOException {
                
    /*try {
        page2 p=new page2();
        p.essayer();
    } catch (Exception e) {
        e.printStackTrace();
    }*/
/*page2 p=new page2();
    p.essayer();
   
}*/




}
}


    
