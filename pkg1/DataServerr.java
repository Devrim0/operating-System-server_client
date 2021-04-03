/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package işletim.sistemi.pkg1;

import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DataServerr {
    public static void main(String[] args) {
        
        Scanner k=new Scanner(System.in);
        String s=k.nextLine();
        try {
            ServerSocket sock=new ServerSocket(6013);
            while(true){
            Socket client=sock.accept();
            PrintWriter pout=new PrintWriter(client.getOutputStream(),true);
            
            pout.println(new java.util.Date().toString());
            pout.println(100+" sayıaı YÜZ OLARAK İFADE EDLİLİR");
            pout.println(s);
            client.close();
        } 
            
        }
            catch (IOException ioe) {
                System.err.println(ioe);
        }
    }
}
