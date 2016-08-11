package training.dayone.practice43.fulippo;


public class PeerSingleton {

    private static final PeerSingleton instance = new PeerSingleton();
    private static String[] hostNames = {
        "192.168.1.1", "200.123.123.231", "183.11.231.1", "12.3.1.4"
    };

    public static String[] getHostNames() {
        return hostNames;
    }

    private PeerSingleton() {
    }

    public static PeerSingleton getInstance(){
        return instance;
    }

}
