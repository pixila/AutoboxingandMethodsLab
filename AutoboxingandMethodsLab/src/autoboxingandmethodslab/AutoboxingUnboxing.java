package autoboxingandmethodslab; // Specifies the package

public class AutoboxingUnboxing { // Defines the main class AutoboxingUnboxing

    public static void main(String[] args) { // Main method where program execution begins

        // Autoboxing: Converting primitive type int to wrapper object
        int num1 = 42; // Declares a primitive int variable num1 and assigns it a value of 42
        Integer wrappedNum1 = num1; // Autoboxing: Converts primitive int to Integer wrapper class automatically

        // 1. Autoboxing: Converting num2 (primitive double) to wrapper object Double
        double num2 = 3.14; // Declares a primitive double variable num2 and assigns it a value of 3.14
        Double wrappedNum2 = num2; // Autoboxing: Converts primitive double to Double wrapper class automatically

        // 2. Autoboxing: Converting char ch to wrapper object wrappedChar
        char ch = 'A'; // Declares a primitive char variable ch and assigns it a value 'A'
        Character wrappedChar = ch; // Autoboxing: Converts primitive char to Character wrapper class automatically

        // Printing autoboxed values
        System.out.println("Autoboxing:"); // Prints the header for autoboxing demonstration
        System.out.println("Wrapped Integer: " + wrappedNum1); // Prints the Integer wrapper value of num1
        System.out.println("Wrapped Double: " + wrappedNum2); // Prints the Double wrapper value of num2
        System.out.println("Wrapped Character: " + wrappedChar); // Prints the Character wrapper value of ch

        // 3. Unboxing: Converting wrapper objects to primitive types
        int unboxedInt = wrappedNum1; // Unboxing: Converts Integer wrapper back to primitive int automatically
        double unboxedDouble = wrappedNum2; // Unboxing: Converts Double wrapper back to primitive double automatically
        char unboxedChar = wrappedChar; // Unboxing: Converts Character wrapper back to primitive char automatically

        // 4. Autoboxing: Invoking add() method and storing result1 as a primitive int
        int result1 = add(unboxedInt, 10); // Autoboxing and unboxing during method call
        System.out.println("\nPrimitive Type Addition: " + result1); // Prints the result of adding unboxedInt and 10

        // 5. Unboxing using intValue() method to extract the primitive int value from the Integer objects
        Integer wrappedSum = add(wrappedNum1, 10); // Autoboxing of int arguments
        int result2 = wrappedSum.intValue(); // Explicit unboxing with intValue()

        System.out.println("Wrapper Class Addition: " + result2); // Prints the result of adding wrappedNum1 and 10 as Integer
    }

    // Method to add two integers and return the result
    public static int add(int a, int b) { // Defines add method that takes two int arguments and returns their sum
        return a + b; // Returns the sum of a and b
    }

}
