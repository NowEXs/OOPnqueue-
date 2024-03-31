import javax.swing.*;
import java.io.*;
import java.net.Socket;

public class testOutComp extends JFrame {
    private final Computer comp = new Computer("66070285", "now", "Lab1", 1, 0);
    private JPanel p;
    private JTextField tf1, tf2, tf3;

    public testOutComp() {
        tf1 = new JTextField(comp.getName(), 10);
        tf2 = new JTextField(comp.getLab_name(), 10);
        tf3 = new JTextField(comp.getStd_id(), 10);
        p = new JPanel();

        p.add(tf1);
        p.add(tf2);
        p.add(tf3);

        add(p);

        try (Socket soc = new Socket("localhost", 2222);
             ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream())) {
            System.out.println("Sending");

            // Write the text to the socket using UTF-8 encoding
            try (OutputStreamWriter writer = new OutputStreamWriter(soc.getOutputStream(), "UTF-8")) {
                writer.write(tf3.getText());
                writer.flush();  // Flush the writer
            }

            out.writeObject(this.comp);
            out.flush(); // Flush the ObjectOutputStream

            System.out.println("Complete!");
        } catch (IOException e) {
            e.printStackTrace(); // Print the stack trace for debugging
            JOptionPane.showMessageDialog(null, "Error sending the object: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(testOutComp::new);
    }
}