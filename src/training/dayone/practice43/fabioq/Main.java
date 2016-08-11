package training.dayone.practice43.fabioq;

/**
 * Created by quinzif on 11/08/2016.
 */
public class Main extends PeerSingleton{
    public static void main(String[] args) {
        PeerSingleton peerList01 = PeerSingleton.getInstance();
        PeerSingleton peerList02 = PeerSingleton.getInstance();

        for (String host: peerList01.getHosts()){
            System.out.println(host);
        }

        for (String host: peerList02.getHosts()){
            System.out.println(host);
        }
    }
}
