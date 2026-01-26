/*
    Exercises

    1. Write a class hierarchy involving the following classes: Figure, Square, Rectangle, Circle, Rhombus, and Trapezoid.
    Figure must be the superclass of all of them. All the others must inherit directly from Figure.

        public class Figure {
        
        }

        public class Square extends Figure {
        
        }

        public class Rectangle extends Figure {
        
        }

        public class Circle extends Figure {
        
        }

        public class Rhombus extends Figure {
        
        }

        public class Trapezoid extends Figure {
        
        }


    2. Refine the solution from Exercise 1. Now there must be the classes Figure2D and Figure3D. Both (and only them) must inherit directly from Figure. 
    All other classes must inherit from Figure2D, Figure3D, or from another subclass. The classes Quadrilateral, Cube, and Sphere must also exist.

        public class Figure {
        
        }

        public class Figure2D extends Figure {
        
        }

        public class Figure3D extends Figure {
        
        }

        public class Square extends Figure2D {
        
        }

        public class Rectangle extends Figure2D {
        
        }

        public class Circle extends Figure2D {
        
        }

        public class Rhombus extends Figure2D {
        
        }

        public class Trapezoid extends Figure2D {
        
        }

        public class Quadrilateral extends Figure2D {
        
        }

        public class Cube extends Figure3D {
        
        }

        public class Sphere extends Figure3D {
        
        }
        
    
    3. Write a class hierarchy to represent animals. There must be a class called Animal that defines the animal’s name and number of legs. It must have three constructors:
        a. a default constructor;
        b. one that receives a string to be assigned to the animal’s name,
        c. and a third one that receives both the number of legs and the name.
    Write a class called Mammal that inherits from Animal. It must have only one constructor, which receives the animal’s name and number of legs and passes them to the superclass constructor.
    Write two classes called Dog and Cat that inherit from Mammal. Both must define a single constructor that receives the animal’s name and passes it to the superclass. Internally, both must pass the value 4 as the number of legs.

        public class Animal {
            String name;
            int numberOfLegs;
        

            //default constructor
            public Animal() {

            }

            public Animal(String name){
                setName(name);
            }
            
            public Animal(String name, int numberOfLegs){
                setName(name);
                setNumberOfLegs(numberOfLegs);
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setNumberOfLegs(int numberOfLegs) {
                this.numberOfLegs = numberOfLegs;
            }
        }

    public class Mammal extends Animal {
    
        //constructor that passes atribute values to the superclass constructor.
        public Mammal(String name, int numberOfLegs) {
            super(name, numberOfLegs);
        }

        public class Dog extends Mammal {

            public Dog(String name) {
                super(name, 4);
            }
        
        }

        public class Cat extends Mammal {

            public Cat(String name) {
                super(name, 4);
            }
        }
    }
    
    4. Write a Test class that instantiates a Dog and a Cat.

        public class Test {
        
            public static void main(String[] args){
                Dog dog = new Dog("puppy");
                Cat cat = new Cat("kitten");
            }
        
        }

    5. Write a class called Oviparous. Research oviparous animals and include two types of oviparous animals as subtypes of Oviparous. Add two attributes to Oviparous that are common to all oviparous animals.

    public class Oviparous extends Animal {
        private int numberOfEggs;
        private int incubationPeriod; // in days
    }

    public class Bird extends Oviparous {
            
    }   

    public class Reptile extends Oviparous {

    }

    6. Consider the class Platypus. Although they are considered oviparous, females produce milk and could have characteristics of interest already defined in the Mammal class. Answer: From which class should Platypus inherit?
        Platypus should inherit from Mammal because although the platypus is oviparous, it produces milk, which is an exclusive characteristic of mammals. 
        In addition, it has other typical mammalian features, such as fur and being warm-blooded. 
        Laying eggs is an exception in its biology, not the rule, so its main characteristics align it more closely with mammals.
*/