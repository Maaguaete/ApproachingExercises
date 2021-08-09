package numbers;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetInputIPAddress {

    void getIPAddress() throws UnknownHostException {

        InetAddress myIP = InetAddress.getLocalHost();
        System.out.println("My Address is: "+ myIP.getAddress());
        System.out.println("My Host Address is: "+ myIP.getHostAddress());
        System.out.println("My getCanonicalHostName is: "+ myIP.getCanonicalHostName());
        System.out.println("My getHostName is: "+ myIP.getHostName());
    }
}
