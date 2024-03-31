import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ObjectServ {
    public ObjectServ(User user){
        if (user instanceof Student){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try(ServerSocket serv = new ServerSocket(2222)){
                        Socket soc = serv.accept();
                        ObjectInputStream obin = new ObjectInputStream(soc.getInputStream());
                        BufferedReader read = new BufferedReader(new InputStreamReader(soc.getInputStream(), "UTF-8"));
                        String time = read.readLine();
                        Computer comp = (Computer) obin.readObject();
                        Feedback fb = new Feedback(comp, time);
                        fb.startServer();
                        fb.setVisible(true);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
    }
}
