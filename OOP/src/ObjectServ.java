import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ObjectServ {
    private String name,lab,time;
    public ObjectServ(User user){
        if (user instanceof Student){
            try (ServerSocket serverSocket = new ServerSocket(5555)) {
                while(true){
                    Socket soc = serverSocket.accept();
                    BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream(),"UTF-8"));
                    String sta = br.readLine();
                    if (sta != null & sta.equals("1")){
                        this.serverLab(user);
                        this.serverName(user);
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                try(ServerSocket serv = new ServerSocket(2222)){
                                    while(true){
                                        Socket soc = serv.accept();
                                        BufferedReader read = new BufferedReader(new InputStreamReader(soc.getInputStream(), "UTF-8"));
                                        time = read.readLine();
                                        Feedback fb = new Feedback(time, name, lab);
                                        fb.startServer();
                                        fb.setVisible(true);
                                        soc.close();
                                    }
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }).start();
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void serverLab(User user){
        if (user instanceof Student){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try(ServerSocket serv = new ServerSocket(3333)){
                        while(true){
                            Socket soc = serv.accept();
                            BufferedReader read = new BufferedReader(new InputStreamReader(soc.getInputStream(), "UTF-8"));
                            lab = read.readLine();
                            soc.close();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
    }
    public void serverName(User user){
        if (user instanceof Student){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try(ServerSocket serv = new ServerSocket(4444)){
                        while(true){
                            Socket soc = serv.accept();
                            BufferedReader read = new BufferedReader(new InputStreamReader(soc.getInputStream(), "UTF-8"));
                            name = read.readLine();
                            soc.close();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();
        }
    }
}
