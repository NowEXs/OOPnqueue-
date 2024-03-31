import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class testComp extends JFrame {
    private JTextField tf1, tf2, tf3;
    private JButton b1;
    private JPanel p1;

    public testComp() {
        tf1 = new JTextField(10);
        tf1.setEditable(false);
        tf2 = new JTextField(10);
        tf2.setEditable(false);
        tf3 = new JTextField(10);
        tf3.setEditable(false);
        p1 = new JPanel();
        b1 = new JButton("Click!");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server();
            }
        });

        p1.add(tf1);
        p1.add(tf2);
        p1.add(tf3);
        p1.add(b1);

        add(p1);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void server() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try (ServerSocket serv = new ServerSocket(2222)) {
                    while (true) {
                        System.out.println("Waiting for connection...");
                        Socket soc = serv.accept();
                        System.out.println("Received connection!");

                        try (BufferedReader name = new BufferedReader(new InputStreamReader(soc.getInputStream(), "UTF-8"))) {
                            String t2 = name.readLine();
                            SwingUtilities.invokeLater(() -> tf2.setText(t2));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                        try (ObjectInputStream obin = new ObjectInputStream(soc.getInputStream())) {
                            Computer comp = (Computer) obin.readObject();
                            SwingUtilities.invokeLater(() -> tf1.setText(comp.getLab_name()));
                            String t = comp.getStd_id();
                            System.out.println(t);
                        } catch (IOException | ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.invokeLater(testComp::new);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}