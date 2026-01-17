import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;

public class LengthConverter {

    public static void createScreen() {
        JFrame frame = new JFrame("Length Converter");

        // Input field
        JTextField centimetersTextField = new JTextField(10);
        JLabel centimetersLabel = new JLabel("cm");

        // Conversion buttons
        JButton toMetersButton = new JButton("To meters");
        JButton toMillimetersButton = new JButton("To millimeters");
        JButton toKilometersButton = new JButton("To kilometers");

        // Result field
        JLabel resultLabel = new JLabel("Result:");

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(3, 2, 5, 5));

        // Row 1
        contentPane.add(centimetersTextField);
        contentPane.add(centimetersLabel);

        // Row 2
        contentPane.add(toMetersButton);
        contentPane.add(toMillimetersButton);

        // Row 3
        contentPane.add(toKilometersButton);
        contentPane.add(resultLabel);

        // Button actions
        toMetersButton.addActionListener(e -> {
            double cm = Double.parseDouble(centimetersTextField.getText());
            double meters = cm / 100;
            resultLabel.setText(String.format("Result: %.4f m", meters));
        });

        toMillimetersButton.addActionListener(e -> {
            double cm = Double.parseDouble(centimetersTextField.getText());
            double millimeters = cm * 10;
            resultLabel.setText(String.format("Result: %.2f mm", millimeters));
        });

        toKilometersButton.addActionListener(e -> {
            double cm = Double.parseDouble(centimetersTextField.getText());
            double kilometers = cm / 100000;
            resultLabel.setText(String.format("Result: %.6f km", kilometers));
        });

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createScreen());
    }
}
