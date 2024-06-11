package Socket_program.Echo_application;
import java.util.*;
import java.net.Socket;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.io.*;


public class MyServer {
    public static void main(String[] args) {
        try{
        System.out.println("Waiting for Clients...");
        ServerSocket ss= new ServerSocket(9806);
        Socket soc = ss.accept();
        System.out.println("Connection established");
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        String str = in.readLine();
        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
        out.println("Server says: "+str);
        } 
        catch(Exception e){
            e.printStackTrace();
        }
    }
} 

