//import static java.lang.Integer.parseInt;
//import static javax.swing.JOptionPane.showInputDialog;
//import static javax.swing.JOptionPane.showMessageDialog;
import java.io.FileInputStream;
import java.util.Properties;

public class App {

    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/app.properties"));

        PersonService service = new PersonService(properties.getProperty("URL"));
        service.list(); 
    }
        
        
        
        /*
        int op;

        String menu =
            "1-Register\n" +
            "2-Update\n" +
            "3-List\n" +
            "4-Remove\n" +
            "0-Exit";

        do {
            op = parseInt(showInputDialog(menu));

            switch (op) {
                case 1: {
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 0: {
                    showMessageDialog(null, "See you later");
                    break;
                }
                default: {
                    showMessageDialog(null, "Invalid option");
                    break;
                }
            }
        } while (op != 0);
    
    */
}
