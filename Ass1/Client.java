import java.rmi.*;
import java.util.*;

public class Client{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        try{
            String serverURL="rmi://localhost/Server";
            ServerIntf serverIntf=(ServerIntf) Naming.lookup(serverURL);

            System.out.print("Enter 1st no:");
            double a=sc.nextDouble();
            System.out.print("Enter 2nd no:");
            double b=sc.nextDouble();

            System.out.print(serverIntf.add(a,b));

            System.out.println("Enter your name:");
            String name=sc.next();
            System.out.print(serverIntf.nameprint(name));

        }
        catch(Exception e){
            System.out.println("Exception occured at client "+e.getMessage());
        }
    }
}