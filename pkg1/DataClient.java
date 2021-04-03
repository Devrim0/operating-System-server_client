
package işletim.sistemi.pkg1;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Devrim
 */
public class DataClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Socket  sock;
        try {
            sock = new Socket("127.0.0.1",6013);
        
        
InputStream in=sock.getInputStream();
BufferedReader bin=new BufferedReader(new InputStreamReader(in));

String line;
while((line=bin.readLine())!=null)
                
                    System.out.println(line);
                    
                    sock.close();}
                 catch (IOException ioe) {
                    System.err.println(ioe);
                }


}
    }
    

