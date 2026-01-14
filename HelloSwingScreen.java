import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.Container;

public class HelloSwingScreen {

    public static void createScreen() {
        JFrame frame = new JFrame("Hello, Swing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a JLabel
        JLabel helloSwingLabel = new JLabel("Hello, Swing!!!!!!!");

        // get the content pane
        Container contentPane = frame.getContentPane();

        // add the JLabel to the content pane
        contentPane.add(helloSwingLabel);

        // adjust frame size to fit its content
        frame.pack();

        // make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createScreen());
    }
}
