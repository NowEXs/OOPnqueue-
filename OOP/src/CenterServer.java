import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class CenterServer {

    public void serverStart(JFrame parent, User user){
        if (user instanceof Student | user instanceof TA){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try (ServerSocket svSocket = new ServerSocket(1111);){
                        while(true){
                            System.out.println("Waiting for command...");
                            Socket socket = svSocket.accept();
                            System.out.println("Command Received!!");
                            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
                            String com = in.readLine();
                            if (in != null & com.equals("0")){
                                if (user instanceof Student){
                                    new YourQ(parent ,true).setVisible(true);
                                }
                                else if (user instanceof TA){
                                    new Thread(() -> {
                                        try {
                                            Thread.sleep(5*60*1000);
                                            SwingUtilities.invokeLater(() -> {
                                                JOptionPane.showMessageDialog(null,"You are checking too long!!!","Why You checking too long",JOptionPane.WARNING_MESSAGE);
                                            });
                                        } catch (InterruptedException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }).start();
                                }

                            }
                            else if (in != null & com.equals("1")){
                                if (user instanceof Student){
                                    try (Socket soc = new Socket("localhsot",5555);
                                    PrintWriter pw = new PrintWriter(soc.getOutputStream(),true)){
                                        pw.println(1);
                                        pw.flush();
                                    }
                                }
                                else if (user instanceof TA){
                                    long startTime = System.currentTimeMillis();
                                    long elapsedTime = (System.currentTimeMillis() - startTime) / 1000 / 60;
                                    if (elapsedTime  < 5){
                                        JOptionPane.showMessageDialog(null,"You are Good Teacher Assistant","Good Job!",JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else if (elapsedTime > 5){
                                        JOptionPane.showMessageDialog(null, "It's ok We hope you better next time", "Feedback Reminder", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                            }
                            else if (in != null & com.equals("2") & user instanceof Student){
                                new Waiting(parent, true).setVisible(true);
                            }
                            socket.close();
                        }
                    } catch (BindException e){
                        System.out.println("ฺBind Exception!");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }) {
            }.start();
        }
    }
}
