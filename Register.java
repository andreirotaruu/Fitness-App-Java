import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {

    private JTextField userField;
    private JPasswordField passField;
    private User currentUser;
    private String registeredUsername;
    private String registeredPassword;
    private Users users = new Users();

    public Register() {
        setTitle("Register");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel formPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        JLabel userLabel = new JLabel("Choose Username:");
        this.userField = new JTextField();
        JLabel passLabel = new JLabel("Choose Password:");
        this.passField = new JPasswordField();

        formPanel.add(userLabel);
        formPanel.add(userField);
        formPanel.add(passLabel);
        formPanel.add(passField);

        JButton registerButton = new JButton("Register");
        JButton backButton = new JButton("Back to Login");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        registerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        backButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPanel.add(registerButton);
        buttonPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        buttonPanel.add(backButton);

        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Register button action
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registeredUsername = userField.getText().trim();
                registeredPassword = new String(passField.getPassword()).trim();

                if (registeredUsername.isEmpty() || registeredPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(Register.this, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        User newUser = new User(registeredUsername, registeredPassword);
                        users.addUser(newUser);

                        JOptionPane.showMessageDialog(Register.this, "Registration successful! Welcome!");

                        SwingUtilities.invokeLater(() -> {
                            Main mainPage = new Main();
                            mainPage.setVisible(true);
                            mainPage.toFront();
                            mainPage.requestFocus();
                        });
                        
                        dispose();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(Register.this, "Something went wrong: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();
                    }
                }
            }
        });

        // Back button action
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(() -> new Login());
                dispose();
            }
        });

        setVisible(true);
    }

    // Getter methods
    public String getRegisteredUsername() {
        return registeredUsername;
    }

    public String getRegisteredPassword() {
        return registeredPassword;
    }
}
