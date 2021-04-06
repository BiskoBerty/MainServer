/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainserver;

import java.net.Socket;
import java.util.Vector;

/**
 *
 * @author Paolo
 */
public class ContoCorrente {
    private String id;
    private Vector<CommunicationManager> listaClient;
    private float saldo;
    
    public ContoCorrente(String id) {
        this.id = id;        
    }

    //passo la socket e l'istanza di se stesso
    public void addClient(Socket s){
        listaClient.add(new CommunicationManager(s, this));
        new Thread(listaClient.elementAt(listaClient.size())).start();
    }
    
    // da fare!
    public boolean versa(float cifra){
        return false;
    }
    
    // da fare!
    public boolean preleva(float cifra){
        return false;
    }
    
    //getSaldo()
}
