package Praktikum;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.Component;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
public class Form extends JFrame {
	private JTextField textField_1;
    private JPasswordField passwordField;
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Form frame = new Form();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }
    });
    }
 
    /**
     * Create the frame.
     */
    public Form() {
        getContentPane().setBackground(new Color(238, 238, 238));
        getContentPane().setLayout(null);
         
        JButton btnNewButton = new JButton("OK");
        btnNewButton.setIcon(new ImageIcon("/home/bagus/workspace/app.penjualan/src/penjualanku/image/ok.jpeg"));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnNewButton.setBounds(103, 166, 67, 31);
        getContentPane().add(btnNewButton);
         
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setIcon(new ImageIcon("/home/bagus/workspace/app.penjualan/src/penjualanku/image/close.jpeg"));
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnCancel.setBounds(185, 166, 99, 31);
        getContentPane().add(btnCancel);
          
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panel.setBounds(10, 82, 418, 175);
        getContentPane().add(panel);
         
        JLabel lblNim = new JLabel("NIM");
        panel.add(lblNim);
        lblNim.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
         
        textField_1 = new JTextField();
        panel.add(textField_1);
        textField_1.setBackground(SystemColor.text);
        textField_1.setColumns(10);
         
        JLabel lblPassword = new JLabel("Password");
        panel.add(lblPassword);
        lblPassword.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
        passwordField = new JPasswordField();
        passwordField.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(passwordField);
        passwordField.setColumns(10);
        passwordField.setBackground(new Color(255, 255, 255));
        setForeground(Color.GRAY);
        setTitle("Entry Mahasiswa");
        setIconImage(Toolkit.getDefaultToolkit().getImage("/home/bagus/workspace/app.penjualan/src/penjualanku/image/user.jpeg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.GRAY);
    }
}
