import javax.swing.JOptionPane;

public class CarTest {
    public static void main(String[] args) {

        String licensePlate1 =
                JOptionPane.showInputDialog("License plate (Car A):");
        String brand1 =
                JOptionPane.showInputDialog("Brand (Car A):");

        String licensePlate2 =
                JOptionPane.showInputDialog("License plate (Car B):");
        String brand2 =
                JOptionPane.showInputDialog("Brand (Car B):");

        Car car1 = new Car(licensePlate1, brand1);
        Car car2 = new Car(licensePlate2, brand2);

        car1.accelerate();
        car1.displayInfo();

        car2.accelerate();
        car2.displayInfo();
    }
}
