import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class testChecking1 extends JFrame {

    public testChecking1() {
        super("Main GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JButton button = new JButton("Click Me!");
        button.addActionListener(new ButtonListener());
        add(button);

        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try (Socket socket = new Socket("localhost", 12345);
                 BufferedReader read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
                writer.println(1); // Send message to server
                String response = read.readLine();
                if (response != null && response.equals("0")) {
                    testChecking1.this.dispose();
                    SwingUtilities.invokeLater(() -> {
                        ExcelViewer excelViewer = new ExcelViewer();
                        excelViewer.setVisible(true);
                    }); // Create ExcelViewer in EDT
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new testChecking1();
    }
}