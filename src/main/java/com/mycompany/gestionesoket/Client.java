/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionesoket;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class Client {
    
    
    public static void main(String[] args) {
        int port = 2000;
        Socket socket=null;
        try {
            //1 richiesta di connessione al server
            socket=new Socket("127.0.0.1",port);
            System.out.println("client connesso con "+ socket.getRemoteSocketAddress());
            System.out.println("posta del clinet"+ socket.getLocalPort());
        } 
                    
          catch(ConnectExeption ex)
                  {
                    System.err.print("server non disponibile");
                  }
          
        
        catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
    
