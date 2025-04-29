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
        setLayout(new GridLayout(6, 1, 10, 10));

        JLabel welcomeLabel = new JLabel("Welcome " + currentUser.getUsername(), SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        JLabel weightLabel = new JLabel("Weight: " + currentUser.getGoalWeight() + " kg", SwingConstants.CENTER);
        weightLabel.setFont(new Font("Arial", Font.BOLD, 20));
        JLabel physiqueLabel = new JLabel("Dream Physique: " + currentUser.getGoalBodyType(), SwingConstants.CENTER);
        physiqueLabel.setFont(new Font("Arial", Font.BOLD, 20));


        JButton workoutPlannerButton = new JButton("Workout Planner");
        JButton dietPlannerButton = new JButton("Diet Planner");
        JButton logoutButton = new JButton("Logout");
        workoutPlannerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Workout(currentUser);
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
                //new Login(); 
            }
        });

        add(welcomeLabel);
        add(weightLabel);
        add(physiqueLabel);
        add(workoutPlannerButton);
        add(dietPlannerButton);
        add(logoutButton);
        
        setVisible(true);
    }
}

