public class GradeBook {

    // Attributes
    private String courseName;

    // Constructor
    public GradeBook(String courseName) {
        this.courseName = courseName;
    }

    /*
        The constructor is a special block of the class
            It has the same name as the class
            It is executed automatically when the object is created
            It is used to initialize (create an instance of) the object,
            that is, to prepare its attributes

        Observe what happens in the client class:
            a. Without a custom constructor.
                GradeBook book = new GradeBook();
                book.setCourseName("OOP");

            b. With a custom constructor.
                GradeBook book = new GradeBook("OOP");
    */

    // Methods
    public void displayMessage() {
        System.out.printf(
            "Welcome to the grade book for the course %s.\n",
            getCourseName()
        );
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
