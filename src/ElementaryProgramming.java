import java.awt.*;
import java.util.Scanner;
import java.util.Date;

public class ElementaryProgramming {
    public static void main(String[] args) {
        // READING INPUT FROM THE CONSOLE

        // The Scanner class is used to read input from the console
        // The Scanner class is in the java.util package
        // Example
        Scanner input = new Scanner(System.in);

        // The nextInt() method reads an integer from the console
        int number = input.nextInt();

        // The next() method reads a string from the console
        String name = input.next();

        // The nextDouble() method reads a double from the console
        double doubleNumberInput = input.nextDouble();

        // The nextBoolean() method reads a boolean from the console
        boolean value = input.nextBoolean();

        // The charAt() method returns the character at the specified index of the string
        char character = input.next().charAt(0);

        // The nextLine() method reads a string from the console
        String line = input.nextLine();

        // VARIABLES
        // A variable is a named memory location that stores a value
        // The value of a variable can be changed during the execution
        // of a program
        // The "type" of a variable determines the size and layout of the
        // variable's memory; the range of values that can be stored
        // within that memory; and the set of operations that can be
        // applied to the variable
        // The name of a variable is a reference to the memory location
        // where the value is stored
        // The name of a variable must be unique within the scope of
        // the variable
        // The scope of a variable is the region of the program where
        // the variable is defined
        // The scope of a variable begins with the declaration of the
        // variable and ends with the end of the block in which the
        // variable is declared

        // PRIMITIVE DATA TYPES
        // A primitive data type is predefined by the language and is
        // named by a keyword
        // The primitive data types are divided into two categories:
        // numeric and non-numeric
        // Numeric data types are divided into two categories:
        // integer types and floating-point types
        // Integer types store whole numbers
        // Floating-point types store fractional numbers
        // Non-numeric data types are divided into two categories:
        // boolean and character types
        // Boolean types store true or false values
        // Character types store a single character

        // NUMERIC DATA TYPES
        // byte
        // The byte data type is an 8-bit signed two's complement
        // integer
        // It has a minimum value of -128 and a maximum value of 127
        // (inclusive)
        // The byte data type can be useful for saving memory in large
        // arrays, where the memory savings actually matters
        // They can also be used in place of int where their limits
        // help to clarify your code; the fact that a variable's range
        // is limited can serve as a form of documentation
        byte byteNumber = 127;

        // short
        // The short data type is a 16-bit signed two's complement
        // integer
        // It has a minimum value of -32,768 and a maximum value of
        // 32,767 (inclusive)
        // As with byte, the same guidelines apply: you can use a short
        // to save memory in large arrays, in situations where the
        // memory savings actually matters
        short shortNumber = 32_767;

        // int
        // By default, the int data type is a 32-bit signed two's
        // complement integer, which has a minimum value of -2^31 and
        // a maximum value of 2^31-1
        // In Java SE 8 and later, you can use the int data type to
        // represent an unsigned 32-bit integer, which has a minimum
        // value of 0 and a maximum value of 2^32-1
        // Use the Integer class to use int data type as an unsigned
        // integer
        int intNumber = 2_147_483_647;

        // long
        // The long data type is a 64-bit two's complement integer
        // The signed long has a minimum value of -2^63 and a maximum
        // value of 2^63-1
        // In Java SE 8 and later, you can use the long data type to
        // represent an unsigned 64-bit long, which has a minimum value
        // of 0 and a maximum value of 2^64-1
        // Use this data type when you need a range of values wider
        // than those provided by int
        // The Long class also contains methods like compareUnsigned,
        // divideUnsigned etc to support arithmetic operations for
        // unsigned long
        long longNumber = 9_223_372_036_854_775_807L;

        // float
        // The float data type is a single-precision 32-bit IEEE 754
        // floating point
        // Its range of values is beyond the scope of this discussion,
        // but is specified in the Floating-Point Types, Formats, and
        // Values section of the Java Language Specification
        // As with the recommendations for byte and short, use a float
        // (instead of double) if you need to save memory in large
        // arrays of floating point numbers
        // This data type should never be used for precise values, such
        // as currency
        // For that, you will need to use the java.math.BigDecimal
        // class instead
        // Numbers and Strings covers BigDecimal and other useful
        // classes provided by the Java platform
        float floatNumber = 3.4028235E38F;

        // double
        // The double data type is a double-precision 64-bit IEEE 754
        // floating point
        // Its range of values is beyond the scope of this discussion,
        // but is specified in the Floating-Point Types, Formats, and
        // Values section of the Java Language Specification
        // For decimal values, this data type is generally the default
        // choice
        // As mentioned above, this data type should never be used for
        // precise values, such as currency
        double doubleNumber = 1.7976931348623157E308;

        // NON-NUMERIC DATA TYPES
        // boolean
        // The boolean data type has only two possible values: true and
        // false
        // Use this data type for simple flags that track true/false
        // conditions
        boolean booleanValue = true;

        // char
        // The char data type is a single 16-bit Unicode character
        // It has a minimum value of '\u0000' (or 0) and a maximum
        // value of '\uffff' (or 65,535 inclusive)
        // char data types are used to store characters
        // The char data type is used to store characters in the
        // Unicode character set
        // Since Java is a Unicode-based language, the char data type
        // is used to store any character
        // A char value is surrounded by single quotes, like 'A'
        char characterValue = 'A';

        // IDENTIFIERS
        // An identifier is a name used to identify a variable, method,
        // class, or interface

        // NAMED CONSTANTS
        // A named constant is a "variable" whose value cannot be
        // changed during the execution of a program
        // The final keyword, when applied to a variable, indicates
        // that the variable's value cannot be changed

        final double PI = 3.14159;

        // REFERENCE DATA TYPES
        // A reference data type is a data type defined by a class,
        // interface, or array
        // They are used for storing complex data types
        // They are not independent entities like primitive data types
        // They are created using the new keyword
        // They are stored in the heap memory
        // The following are the reference data types:
        // Class
        // Interface
        // Array

        // Example
        Date now = new Date();
        System.out.println("The current date and time is " + now);

        // Difference between primitive and reference data types
        // Primitive data types are predefined by the language and are
        // named by a keyword
        // Reference data types are defined by classes and are named
        // by an identifier that is the name of the class
        // Primitive data types are stored in the stack memory
        // Reference data types are stored in the heap memory
        // Primitive data types start with a lowercase letter
        // Reference data types start with an uppercase letter
        // Primitive data types have values
        // Reference data types have addresses
        // Primitive data types are copied by value
        // Reference data types are copied by reference

        // Example 1
        int x = 10;
        int y = x;
        System.out.println("x = " + x + ", y = " + y); // x = 10, y = 10
        x = 20;
        System.out.println("x = " + x + ", y = " + y); // x = 20, y = 10

        // Example 2
        Point point1 = new Point(7, 11);
        Point point2 = point1;
        System.out.println("point1: " + point1); // point1: (7, 11)
        System.out.println("point2: " + point2); // point2 is a copy of point1


        // TYPE CASTING
        // Type casting is when you assign a value of one primitive
        // data type to another type
        // There are two types of type casting: implicit and explicit
        // Implicit casting is done automatically when passing a
        // smaller size type to a larger size type
        // Explicit casting must be done manually by placing the type
        // in parentheses in front of the value
        // Implicit casting is also known as widening casting
        // Explicit casting is also known as narrowing casting

        // Casting in an augmented assignment statement
        // augmented expression of the form x1 op= x2 is implemented as x1 =
        // (T)(x1 op x2), where T is the type for x1
        // // x = (int) (x + 1.5);
        // int x = 10;
        // x += 1.5;
        // System.out.println(x); // 11

        // Example 1
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); // Outputs 9.0

        // Example 2
        double mySecondDouble = 9.78;
        int mySecondInt = (int) mySecondDouble; // Manual casting: double to int
        System.out.println(mySecondDouble); // Outputs 9.78
        System.out.println(mySecondInt); // Outputs 9

        // Example 3
        int myThirdInt = 200;
        byte myThirdByte = (byte) myThirdInt;
        System.out.println(myThirdInt); // Output 200
        // The byte data is 8 bits, so the value 200 is too large to be stored in a byte
        // variable. The value 200 is stored in a 32-bit integer, which is then converted
        // to a byte. The result is 200 - 256 = -56.
        // This is called a narrowing conversion, because the value is being converted
        // from a larger type to a smaller type.
        System.out.println(myThirdByte); // Output -56


        // STRINGS
        // A string is a sequence of characters
        // A string is a data type, but it is treated like a reference
        // data type
        // Strings are immutable, which means that once a string is
        // created, it cannot be changed
        // The String class has many methods for examining individual
        // characters of the sequence, for comparing strings, for
        // searching strings, for extracting substrings, and for
        // creating a copy of a string with all characters translated
        // to uppercase or to lowercase
        // The String class also includes methods for converting a
        // string to a byte array and vice versa
        // The String class is final, which means that it cannot be
        // subclassed

        // Example
        String message = "Hello World!";
        String newMessage = message.replace("!", "*");
        System.out.println(newMessage);
    }
}
