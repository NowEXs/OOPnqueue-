import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class testChecking2 extends JFrame implements ActionListener {

    private JTextArea textArea;

    public testChecking2() {
        super("Server GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        setVisible(true);

        startServer();
    }

    private void startServer() {
        try ( ServerSocket serverSocket = new ServerSocket(12345);) {
            // Port number
            while (true) {
                Socket socket = serverSocket.accept(); // Accept client connection
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message = reader.readLine();
                textArea.append(message + "\n"); // Display received message
                if ((Integer.parseInt(message) == 1)) {
                    PrintWriter write = new PrintWriter(socket.getOutputStream(), true);
                    write.println(0);

                }
                socket.close();
            }
        } catch (RuntimeException | IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new testChecking2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}