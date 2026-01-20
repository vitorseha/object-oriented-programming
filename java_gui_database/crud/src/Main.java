import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String menu =
                "1 - Register\n" +
                "2 - Update\n" +
                "3 - Delete\n" +
                "4 - List\n" +
                "0 - Exit";

        int option = -1;

        do {
            try {
                option = Integer.parseInt(
                        JOptionPane.showInputDialog(menu)
                );

                switch (option) {

                    case 1: {
                        String name = JOptionPane.showInputDialog("Name?");
                        String phone = JOptionPane.showInputDialog("Phone?");
                        String email = JOptionPane.showInputDialog("Email?");

                        Person p = new Person();
                        p.setName(name);
                        p.setPhone(phone);
                        p.setEmail(email);
                        p.insert();
                        break;
                    }

                    case 2: {
                        String name = JOptionPane.showInputDialog("Name?");
                        String phone = JOptionPane.showInputDialog("Phone?");
                        String email = JOptionPane.showInputDialog("Email?");
                        int id = Integer.parseInt(
                                JOptionPane.showInputDialog("ID?")
                        );

                        Person p = new Person();
                        p.setName(name);
                        p.setPhone(phone);
                        p.setEmail(email);
                        p.setId(id);
                        p.update();
                        break;
                    }

                    case 3: {
                        int id = Integer.parseInt(
                                JOptionPane.showInputDialog("ID?")
                        );

                        Person p = new Person();
                        p.setId(id);
                        p.delete();
                        break;
                    }

                    case 4: {
                        Person p = new Person();
                        p.list();
                        break;
                    }

                    case 0:
                        JOptionPane.showMessageDialog(null, "Exiting...");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Please enter a valid number"
                );
            }

        } while (option != 0);
    }
}
