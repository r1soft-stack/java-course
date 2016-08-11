package training.dayone.practice43.grassog;

/**
 * Created by grassog on 11/08/2016.
 */
public class PeerSingeton {

    private static final PeerSingeton instance = new PeerSingeton();

    private String hostnames[] = {"192.168.1.1", "192.168.1.2", "192.168.1.3", "192.168.1.4"};

    private PeerSingeton(){}

    public static PeerSingeton getInstance(){
        return instance;
    }

    public String[] getHostnames(){
        return hostnames;
    }

}
