import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class CenterServer {

    public void serverStart(JFrame parent){
        try (ServerSocket svSocket = new ServerSocket(1111);){
            while(true){
                System.out.println("Waiting for command...");
                Socket socket = svSocket.accept();
                System.out.println("Command Received!!");
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                String com = in.readLine();
                if (in != null & com.equals("0")){
                    new YourQ(parent ,true).setVisible(true);
                }
                else if (in != null & com.equals("1")){
                    Feedback fb = new Feedback();
                    fb.startServer();
                    fb.setVisible(true);
                }
                else if (in != null & com.equals("2")){
                    new Waiting(parent, true).setVisible(true);
                }
                socket.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
