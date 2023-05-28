import java.rmi.*;

interface ServerIntf extends Remote{
    //throw if object not found
    double add(double a,double b) throws RemoteException;
    String nameprint(String name) throws RemoteException;
}