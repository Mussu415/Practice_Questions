package Socket_program.Connection_establishment;
//import java.util.io;
import java.util.*;
import java.net.Socket;
import java.net.ServerSocket;

public class MyServer {
    public static void main(String[] args) {
        try{
        System.out.println("Waiting for Clients...");
        ServerSocket ss= new ServerSocket(9806);
        Socket soc = ss.accept();
        System.out.println("Connection established");
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    }
} 
