import java.rmi.*;
import java.rmi.server.*;

public class Two extends UnicastRemoteObject implements One {
    public Two() throws RemoteException
    {
        super();
    }

    public int add(int a, int b) throws RemoteException {
        System.out.println("hello");
        return (a + b);

    }

    public int sub(int a, int b) throws RemoteException {
        System.out.println("hello");
        return (a - b);
    }

}

