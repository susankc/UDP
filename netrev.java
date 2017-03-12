import java.io.*;
import java.net.*;

class netrev
{
    public static void main(String args[]) throws IOException
    {
        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte[] recData = new byte[1024];
        int i =0;

        
        PrintWriter out = new PrintWriter(file);


        //BufferedOutputStream bos = new BufferedOutputStream(fos);

       while(true)
        {
            DatagramPacket recPacket = new DatagramPacket(recData, recData.length);
            serverSocket.receive(recPacket);
            System.out.println("\n Packet length: " + recPacket.getLength());
            out.write((recPacket.getData(), 0, recPacket.getLength());
            System.out.println("\nPacket" + ++i + " written to file\n");
            out.flush();
        }
    }
}
java udp client