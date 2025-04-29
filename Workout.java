import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Workout {
    public Workout(User currentUser) {
        // Create the frame
        JFrame frame = new JFrame("Fitness Goals Setup");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Goal Weight Label and Text Field
        JLabel weightLabel = new JLabel("Goal Weight (lbs):");
        JTextField weightField = new JTextField(10);

        currentUser.setGoalWeight(Integer.parseInt(weightField.getText()));
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(weightLabel, gbc);

        gbc.gridx = 1;
        frame.add(weightField, gbc);

        // Dream Physique Label and Combo Box
        JLabel physiqueLabel = new JLabel("Dream Physique Type:");
        String[] physiqueOptions = { "Athletic", "Lean", "Bulky", "Toned", "Bodybuilder" };
        JComboBox<String> physiqueComboBox = new JComboBox<>(physiqueOptions);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(physiqueLabel, gbc);

        gbc.gridx = 1;
        frame.add(physiqueComboBox, gbc);

        // Submit Button
        JButton submitButton = new JButton("Submit");

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        frame.add(submitButton, gbc);

        // Action Listener for Submit Button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String weight = weightField.getText();
                String physique = (String) physiqueComboBox.getSelectedItem();

                JOptionPane.showMessageDialog(frame, "Your Goal:\nWeight: " + weight + " lbs\nPhysique: " + physique);
            }
        });

        // Make the frame visible
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}

