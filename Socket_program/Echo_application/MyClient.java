package Socket_program.Echo_application;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.net.Socket;
//import java.util.*;
import java.io.*;
import java.net.Socket;

public class MyClient {
     public static void main(String[] args) {
        try{
        System.out.println("Client started");
        Socket soc= new Socket("localhost", 9806);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string: ");
        String str = userInput.readLine();
        PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
        out.println(str);
        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
        System.out.println(in.readLine());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}





// System.in - in is input strem object reads 1 byte of data at a tym
//takes byte stream and gives character stream 
//Bufferedreader- capable of reading an entire string at a time
//true for autoflush