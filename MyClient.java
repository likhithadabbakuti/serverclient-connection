// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost", 6666 );
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            System.out.println(s.getLocalAddress());
            System.out.println(s.getPort());
            System.out.println(s.getLocalSocketAddress());
            System.out.println(s.getLocalPort());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}