package helloworld;

import java.io.*;

import java.net.*;

public class Client {

    public static void main(String args[]) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        PrintWriter os = new PrintWriter(socket.getOutputStream());
        BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        os.print("i'm client");
        os.flush();
        String s = is.readLine();
        System.out.println("收到来自服务端的消息【"+s+"】");
    }
}