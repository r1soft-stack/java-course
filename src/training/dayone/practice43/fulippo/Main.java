package training.dayone.practice43.fulippo;


public class Main {
    public static void main(String[] args) {

        PeerSingleton list1 = PeerSingleton.getInstance();

        for( String hostName: PeerSingleton.getHostNames()){
            System.out.println("HostName: "+hostName);

        }

        PeerSingleton list2 = PeerSingleton.getInstance();

        for( String hostName: PeerSingleton.getHostNames()){
            System.out.println("HostName: "+hostName);

        }

    }
}
