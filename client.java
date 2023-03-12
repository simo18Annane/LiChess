import java.net.*;
import java.io.*;
import java.util.*;

public class client {
    public final static int port = 8080;

    public static void main(String[] args) throws IOException {
        System.out.println("pour afficher les partie d'un joueurs taper 1");
        System.out.println("pour afficher la partie taper 2");
        System.out.println("pour afficher la partie taper 3");
        Scanner Demande = new Scanner(System.in);
        Socket c = new Socket(args[0], port);
        PrintWriter pr = new PrintWriter(c.getOutputStream());
        pr.println("is it working");
        pr.flush();
        InputStreamReader in = new InputStreamReader(c.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
        String str = br.readLine();
        System.out.println("serveur:" + str);

        PrintStream ps = new PrintStream(c.getOutputStream());
        int Cc = Demande.nextInt();
        if (Cc == 1) {
            System.out.println("Donnez le nom du joueurs");
            Scanner Demande2 = new Scanner(System.in);
            String nom = Demande2.nextLine();
        } else if (Cc == 2) {
            System.out.println("Donnez le nom de la partie");
            Scanner Demande2 = new Scanner(System.in);
            String nom = Demande2.nextLine();
        } else {
            System.out.println("Donnez le de la partie pour laquelle vous voulez afficher les 5 coups");
            Scanner Demande2 = new Scanner(System.in);
            String nom = Demande2.nextLine();
        }
        c.close();

    }

}
