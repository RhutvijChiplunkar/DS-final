import java.io.*;
import java.util.*;
import java.net.Socket;

public class Client{
    public static void main(String args[]) throws Exception{
        
        int n,temp;

        Scanner sc=new Scanner(System.in);
        Socket s=new Socket("127.0.0.1",8000);

        //send to the server
        System.out.println("Enter any number:");
        n=sc.nextInt();
        PrintStream p=new PrintStream(s.getOutputStream());
        p.println(n);

        //receive from server
        Scanner sc1=new Scanner(s.getInputStream());
        temp=sc1.nextInt();
        System.out.println(temp);
    }
}