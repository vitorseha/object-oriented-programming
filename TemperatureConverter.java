import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;

public class TemperatureConverter {

    public static void createScreen() {
        JFrame frame = new JFrame("Converter");

        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("\u00B0C");
        JButton convertButton = new JButton("Convert");
        JLabel convertedValueLabel = new JLabel("");

        // To appear on the screen, components must be added to the JFrame content pane
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(2, 4, 2, 4));
        contentPane.add(celsiusTextField);
        contentPane.add(celsiusLabel);
        contentPane.add(convertButton);
        contentPane.add(convertedValueLabel);

        convertButton.addActionListener(e -> {
            double celsius = Double.parseDouble(
                    celsiusTextField.getText()
            );
            double fahrenheit = celsius / 5 * 9 + 32;
            convertedValueLabel.setText(
                    String.format("%.2f\u00B0F", fahrenheit)
            );
        });

        // Adjusts width and height according to content
        // frame.pack();

        // Centers the window
        frame.setLocationRelativeTo(null);

        // Changes default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Makes the window visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createScreen();
        });
    }
}
