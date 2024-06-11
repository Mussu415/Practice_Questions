//connection establishment between server and client 

package Socket_program.Connection_establishment;
import java.net.Socket;
import java.util.*;

public class MyClient {
    public static void main(String[] args) {
        try{
        System.out.println("Client started");
        Socket soc= new Socket("localhost", 9806);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
