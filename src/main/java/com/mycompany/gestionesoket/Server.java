/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestionesoket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class Server {

    public static void main(String[] args) {

           int port = 2000;
           int time=5000;
           BufferedWriter bw= null;
           BufferedReader br=null;
           
           
           
           Socket socket= null;
        try {
   
            //1 server in ascolto in una porta
            ServerSocket serverSocket=new ServerSocket(port);
            System.out.println("server avviato correttamente");
            //2 server in attesa della connessione
            socket =serverSocket.accept();
            System.out.println("è stata realizzata la connesione con il client"+ socket.getRemoteSocketAddress());
                    
                    
                    
            OutputStream os = socket.getOutputStream();
            bw = new BufferedWriter(new OutputStreamWriter(os));
            bw.write("benvenuto client");
            //chiudere outputstream
            bw.flush();
            
            
            
            //3 scambio dati lettura messaggio client
            InputStream is = socket.getInputStream();
            br = new BufferedReader(new InputStreamReader(is));
            System.out.println(br.readLine());
            
        } catch (IOException ex) {
            System.err.println("errore nella creazione del server e nell'avvio del servizio");
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        //3 scambio dati
        
        
        
        //4 chiusura socket
       finally
        {
            try
            {
                if(socket!=null) 
                    socket.close();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
    
    
