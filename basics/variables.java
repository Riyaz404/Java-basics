//Declaring Variables
public class variables {
    public static void main(String[] args) {
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
        final int myNum2 = 15;       // final keyword, can't be changed
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        System.out.println(myNum2);
    }
}

//------use of plus+-----
public class variables {
    public static void main(String[] args) {
        String name = "John";
        System.out.println("Hello " + name); // Outputs "Hello John" (+) is used to concatenate strings
    }
}