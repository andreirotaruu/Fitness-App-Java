import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private User currentUser;

    public Main(User currentUser) {
        this.currentUser = currentUser;
        setTitle("Main Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 10, 10));

        JLabel welcomeLabel = new JLabel("Welcome " + currentUser.getUsername(), SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JButton workoutPlannerButton = new JButton("Workout Planner");
        JButton dietPlannerButton = new JButton("Diet Planner");
        JButton logoutButton = new JButton("Logout");
        workoutPlannerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Main.this, "Workout Planner Coming Soon!");
            }
        });

        dietPlannerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Main.this, "Diet Planner Coming Soon!");
            }
        });

        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Login(); 
            }
        });

        add(welcomeLabel);
        add(workoutPlannerButton);
        add(dietPlannerButton);
        add(logoutButton);
        setVisible(true);
    }
}

