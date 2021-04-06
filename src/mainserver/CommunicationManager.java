
package mainserver;

import java.net.Socket;

/**
 *
 * @author Paolo
 */
public class CommunicationManager implements Runnable{
    private final ContoCorrente cc;
    private Socket s;
    //stream    
    
    public CommunicationManager(Socket s, ContoCorrente cc) {
        this.s = s;
        this.cc = cc;
    }

    
    @Override
    public void run() {
        //gestione dei messaggio ricevuti dal client e le funzioni del contoCorrente
    }
    
}
