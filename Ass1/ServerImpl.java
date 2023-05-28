import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf{

    public ServerImpl() throws RemoteException{

    }
    public double add(double a,double b) throws RemoteException{
        return a+b;
    }
    public String nameprint(String name) throws RemoteException{
        return "Hello "+name;
    }
}