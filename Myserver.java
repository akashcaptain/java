import java.io.*;
import java.net.*;
class Myserver{
   public static void main(String[] args) {
    try {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = (String)dis.readUTF();
        System.out.println(str);
        ss.close();
    
    } catch (Exception e) {
        //TODO: handle exception
        System.out.println(e);
    }
   }
}
