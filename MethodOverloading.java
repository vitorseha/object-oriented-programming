/*
    Exercises

    1. Write a class called Printer. This class is responsible for printing different kinds of content on the screen.
    It must have several methods called display. They can coexist thanks to the mechanism known as method overloading.
    Write versions of the display method with the following parameter lists:

        1.1 a single float
        1.2 two floats
        1.3 a float and a String, in this order
        1.4 a String and a float, in this order
        1.5 three Strings
        1.6 two ints and a String, in this order

    In all cases, each display method must print all values using System.out.println, separating each value by a comma.

    public class Printer {

        public void display(float a) {
            System.out.println(a);
        }

        public void display(float a, float b) {
            System.out.println(a + ", " + b);
        }

        public void display(float a, String b) {
            System.out.println(a + ", " + b);
        }

        public void display(String a, float b) {
            System.out.println(a + ", " + b);
        }

        public void display(String a, String b, String c) {
            System.out.println(a + ", " + b + ", " + c);
        }

        public void display(int a, int b, String c) {
            System.out.println(a + ", " + b + ", " + c);
        }
    }

    2. Write a test class that calls each of the methods written in exercise 1.

    public class PrinterTest {

        public static void main(String[] args) {

            Printer printer = new Printer();

            printer.display(1.5f);
            printer.display(1.5f, 2.5f);
            printer.display(3.5f, "Hello");
            printer.display("World", 4.5f);
            printer.display("One", "Two", "Three");
            printer.display(10, 20, "Test");
        }
    }

    3. Write a class called ScientificCalculator. It must perform exponentiation and root operations
    with integers and real numbers.

    public class ScientificCalculator {

        
        3.1 Write a method called root. Using method overloading, it must have three versions:

            3.1.1 Parameter list with an integer
            3.1.2 Parameter list with a double
            3.1.3 Parameter list with a String (internally converts the String to Double
                  using Double.parseDouble before performing the operation)

        Hint: Use Math.sqrt to calculate the square root.
        All methods must return double.
    

        public double root(int value) {
            return Math.sqrt(value);
        }

        public double root(double value) {
            return Math.sqrt(value);
        }

        public double root(String value) {
            return Math.sqrt(Double.parseDouble(value));
        }
   
        3.2 Write a method called power. Using method overloading, it must have three versions:

            3.2.1 Parameter list with two bytes a and b. Calculates and returns a raised to b.
            3.2.2 Parameter list with two Strings s1 and s2. Converts both to double,
                  calculates and returns s1 raised to s2.
            3.2.3 Parameter list with an integer a and a double b. Calculates and returns a raised to b.

        Hint: Use Math.pow to calculate the power.
        All methods must return double.    

        public double power(byte a, byte b) {
            return Math.pow(a, b);
        }

        public double power(String s1, String s2) {
            return Math.pow(
                Double.parseDouble(s1),
                Double.parseDouble(s2)
            );
        }

        public double power(int a, double b) {
            return Math.pow(a, b);
        }
    }

    4. Write a test class to test all methods of your scientific calculator.

    public class ScientificCalculatorTest {

        public static void main(String[] args) {

            ScientificCalculator calculator = new ScientificCalculator();

            System.out.println(calculator.root(16));
            System.out.println(calculator.root(25.0));
            System.out.println(calculator.root("36"));

            System.out.println(calculator.power((byte) 2, (byte) 3));
            System.out.println(calculator.power("2", "4"));
            System.out.println(calculator.power(3, 2.5));
        }
    }
*/