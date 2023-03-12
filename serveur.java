import java.net.*;
import java.io.*;

public class serveur {
    public final static int port = 8080;

    public static void main(String[] args) throws IOException {
        ServerSocket cs = new ServerSocket(port);
        Socket c = cs.accept();

        System.out.println("client connected");
        InputStreamReader in = new InputStreamReader(c.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("client :" + str);

        PrintWriter pr = new PrintWriter(c.getOutputStream());
        pr.println("yes");
        pr.flush();

    }

}
