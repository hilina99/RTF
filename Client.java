//import java.io.*;
import java.rmi.*;
//import java.net.*;

public class Client {
    public static void main (String args[]) {
        try
        {
            String s1="rmi://localhost/add";
            One onex=(One)Naming.lookup(s1);
            int m = onex.add(40,30);
            System.out.println("Addition:"+ m);

            String s2 ="rmi://localhost/sub";
            One oney = (One)Naming.lookup(s2);
            int n =oney.sub(40,30);
            System.out.println("Subtraction :"+n);

        }
        catch(Exception e)
        {
            System.out.println("Exception"+e);
        }
    }
}
