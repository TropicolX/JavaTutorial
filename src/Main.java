// public class Main {
//     // Method: main
//     // "public" means that this method can be called from anywhere
//     // "static" means that this method can be called without
//     // creating an instance of the class
//     // "void" means that this method does not return a value
//     // "String[] args" means that this method takes an array
//     // of strings as an argument
//     // "public" is an access modifier
//     // "static" is a keyword
//     // "void" is a return type
//     // "String[] args" is a parameter

//     // Access modifiers are used to restrict access to classes,
//     // methods, and variables. There are four access modifiers:
//     // public, private, protected, and default.
//     // public: The class, method, or variable can be accessed
//     // from anywhere
//     // private: The class, method, or variable can only be
//     // accessed within the declared class
//     // protected: The class, method, or variable can be accessed
//     // within the declared class, within classes that are in the
//     // same package, and within subclasses even if they are in
//     // a different package

//     // naming conventions
//     // classes use PascalCase
//     // methods and variables use camelCase

//     // bytecode files are files with .class extension

//     // Methods are contained in a class. To run a Java program, the program must have a
//     // method. The main method is the entry point where the program starts when it is
//     // executed.

//     // Syntax errors
//     // are errors that result from errors in code construction,
//     // such as mistyping a keyword, omitting some necessary
//     // punctuation, or using an opening brace without a
//     // corresponding closing brace.

//     // Runtime errors
//     // are errors that occur while a program is running when
//     // the environment detects an operation that is
//     // impossible to carry out

//     // Logic errors
//     // occur when a program does not perform the way it was
//     // intended to.

//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }

public class Main {
    public static void main(String[] args) {
        DiningPhilosophers diningPhilosophers = new DiningPhilosophers();

        for (int i = 0; i < DiningPhilosophers.NUM_PHILOSOPHERS; i++) {
            final int philosopherId = i;
            new Thread(() -> {
                try {
                    diningPhilosophers.dine(philosopherId);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}