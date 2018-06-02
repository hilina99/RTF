//import java.io.*;
import java.rmi.*;
//import java.net.*;

public class Server {
    public static void main (String args[]) {
        try {
            Two twox = new Two();
            Naming.rebind("add", twox);
            System.out.println("Object registered");

            Two twoy = new Two();
            Naming.rebind("sub", twoy);
            System.out.println("Object registered");

        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
    }
   
}
