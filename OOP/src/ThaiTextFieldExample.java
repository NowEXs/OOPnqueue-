import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThaiTextFieldExample extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;

    Font thaiFont = new Font("Tahoma", Font.PLAIN, 16);

    public ThaiTextFieldExample() {
        setTitle("ตัวอย่าง Text Field ภาษาไทย");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textField = new JTextField(20);
        textField.setFont(thaiFont);
        textField.setHorizontalAlignment(JTextField.LEFT);
        textField.addActionListener(this);

        button = new JButton("ส่งข้อมูล");
        button.setFont(thaiFont);
        button.addActionListener(this);

        add(textField, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == textField || e.getSource() == button) {
            String text = textField.getText();
            // แสดงกล่องข้อความแบบกำหนดฟอนต์
            showMessageDialogWithThaiFont(this, "คุณป้อน: " + text);
        }
    }

    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        System.setProperty("sun.jnu.encoding", "UTF-8");

        SwingUtilities.invokeLater(() -> new ThaiTextFieldExample().setVisible(true));
    }

    // ตัวเมทอดสำหรับแสดงกล่องข้อความที่กำหนดฟอนต์
    private void showMessageDialogWithThaiFont(Component parentComponent, String message) {
        JLabel label = new JLabel(message);
        label.setFont(thaiFont);
        JOptionPane.showMessageDialog(parentComponent, label);
    }
}