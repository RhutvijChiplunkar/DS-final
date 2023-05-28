//we create stub objects here
import java.rmi.*;

public class Server{
    public static void main(String[] args){

        try{
            //register bject in rmi
            ServerImpl serverImpl=new ServerImpl();
            Naming.rebind("Server",serverImpl);
        }
        catch(Exception e){
            System.out.println("Exception occured at server "+e.getMessage());
        }
    }
}