package training.dayone.practice43.fabioq;

/**
 * Created by quinzif on 11/08/2016.
 */
public class PeerSingleton {

    private static final PeerSingleton instance = new PeerSingleton();
    private String[] hosts = {"122.100.22.33","111.222.4.0","127.0.0.1","0.0.0.0"};


    public PeerSingleton() {
    }

    public static PeerSingleton getInstance(){
        return instance;
    }

    public String[] getHosts() {
        return hosts;
    }
}
