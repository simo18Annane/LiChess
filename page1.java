import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;

public class page1 {

        // Hashtable<String, String> info = new Hashtable<String, String>();
        //FileReader reader = new FileReader("lichess.pgn");
    private File file = null;
    private FileReader reader = null;
    private BufferedReader bufferread = null;
    private StreamTokenizer token = null;

    public page1() throws FileNotFoundException {
        file = new File("test.txt");
        reader = new FileReader(file);
        bufferread = new BufferedReader(reader);//a changer

    }
        

    public void essayer() throws IOException{
        int i = 0;
        final int delimiters = '"';
        token = new StreamTokenizer(bufferread);
        while ((i = token.nextToken()) != StreamTokenizer.TT_EOF) {
            switch (i) {
                case StreamTokenizer.TT_NUMBER:
                     System.out.println("" + token.nval);

                    break;
                case StreamTokenizer.TT_WORD:
                     System.out.println("" + token.sval);

                    break;
                case delimiters:
                     System.out.println("" + token.sval);

                    break;

            }
        }

    }
}



