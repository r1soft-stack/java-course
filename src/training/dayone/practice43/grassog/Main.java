package training.dayone.practice43.grassog;

/**
 * Created by grassog on 11/08/2016.
 */
public class Main {

    public static void main(String[] args) {
        PeerSingeton peerList01 = PeerSingeton.getInstance();
        PeerSingeton peerList02 = PeerSingeton.getInstance();

        for(String hostName:peerList01.getHostnames()){
            System.out.println("Hostname: " + hostName);
        }

        for(String hostName:peerList02.getHostnames()){
            System.out.println("Hostname: " + hostName);
        }

    }

}
