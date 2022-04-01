/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestionesoket;

import java.io.IOException;
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
        try {
            //1 server in ascolto in una porta
            ServerSocket serverSocket=new ServerSocket(2000);
            System.out.println("server avviato correttamente");
            //2 server in attesa della connessione
            Socket socket=serverSocket.accept();
            System.out.println("è stata realizzata la connesione con il client");
            
        } catch (IOException ex) {
            System.err.println("errore nella creazione del server e nell'avvio del servizio");
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
