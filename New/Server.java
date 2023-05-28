import java.io.*;
import java.util.*;
import java.net.Socket;
import java.net.ServerSocket;

public class Server{
    public static void main(String args[]) throws Exception{
        
        int number,temp;

        //accept from the port
        ServerSocket s1=new ServerSocket(8000);
        Socket ss=s1.accept();

        //modify the number
        Scanner sc = new Scanner(ss.getInputStream());
        number=sc.nextInt();
        temp=2*number;

        //pass the result to client
        PrintStream p=new PrintStream(ss.getOutputStream());
        p.println(temp);

    }
}