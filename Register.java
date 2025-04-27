import javax.swing.*;
import java.awt.*;

public class Register extends JFrame {

    public Register() {
        setTitle("Register");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel formPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        JLabel userLabel = new JLabel("New Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("New Password:");
        JPasswordField passField = new JPasswordField();
        JLabel confirmPassLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPassField = new JPasswordField();

        formPanel.add(userLabel);
        formPanel.add(userField);
        formPanel.add(passLabel);
        formPanel.add(passField);
        formPanel.add(confirmPassLabel);
        formPanel.add(confirmPassField);

        JButton registerButton = new JButton("Register");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(registerButton);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}

