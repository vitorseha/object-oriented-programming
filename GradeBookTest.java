import javax.swing.JOptionPane;
public class GradeBookTest {
    public static void main(String[] args) {

        String firstCourseName =
                JOptionPane.showInputDialog("Name of the first course:");
        String secondCourseName =
                JOptionPane.showInputDialog("Name of the second course:");

        GradeBook gradeBook1 = new GradeBook(firstCourseName);
        GradeBook gradeBook2 = new GradeBook(secondCourseName);

        gradeBook1.displayMessage();
        gradeBook2.displayMessage();
    }
}

/*
    public class GradeBookTest {
        public static void main(String[] args) {

            GradeBook book = new GradeBook();
            // The object is what is created with 'new'
            // The variable 'book' of type GradeBook is the reference variable

            String courseName = JOptionPane.showInputDialog("Course name:");
            book.setCourseName(courseName);

            // This was necessary because the default JVM constructor was used
            book.displayMessage();
        }
    }
*/
