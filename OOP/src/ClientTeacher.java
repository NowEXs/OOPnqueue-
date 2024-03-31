import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientTeacher {
    private ServerSocket soc;
    private BufferedReader in;
    private JFrame frame;
    private JPanel p1,p2;
    private JLabel bg;
    private JTextArea ta;


    public ClientTeacher() {
        frame = new JFrame("TeacherApp");
        ta = new JTextArea(22, 30);
        try {
            File fontStyle_minecraft = new File("OOP/src/Font/minecraft_font.ttf");
            Font font_feedback = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(12f);
            ta.setFont(font_feedback);
            ta.setForeground(new java.awt.Color(255, 244, 204));
        } catch (FontFormatException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        ta.setBackground(new java.awt.Color(102, 51, 0));
        ta.setBorder(new LineBorder(new Color(102, 51, 0)));
        ta.setEditable(false);
        p1 = new JPanel(); p2 = new JPanel();
        bg = new JLabel();

        bg.setLayout(new BorderLayout());
        p2.setOpaque(false);

        bg.add(p2);
        bg.setBackground(new java.awt.Color(84, 59, 45));
        bg.setForeground(new java.awt.Color(255, 244, 204));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/FeedbackWood.png"))); // NOI18N

        p2.add(new JScrollPane(ta));
        p1.add(bg);
        p1.setBackground(new java.awt.Color(84, 59, 45));

        frame.add(p1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new ClientTeacher().startServer();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void HistoryInput() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Comment.txt"), "UTF-8"))) {
            StringBuilder historyText = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                historyText.append(line).append("\n");
            }
            ta.setText(historyText.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startServer() {
        this.HistoryInput();
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Comment.txt", true), "UTF-8")))) {
            soc = new ServerSocket(608);
            while (true) {
                System.out.println("Waiting for input...");
                Socket sev = soc.accept();
                System.out.println("Input Received!");
                in = new BufferedReader(new InputStreamReader(sev.getInputStream(), "UTF-8"));
                String txt = in.readLine();
                pw.println(txt);
                pw.flush();
                PrintWriter output = new PrintWriter(sev.getOutputStream(), true);
                output.println("Complete!!");
                sev.close();
                this.HistoryInput();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}