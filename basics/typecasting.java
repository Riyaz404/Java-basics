//Java Type Casting
// Type casting is when you assign a value of one primitive data type to another type.
// There are two types of casting in Java:
// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte


// Widening Casting
// byte -> short -> char -> int -> long -> float -> double




// Narrowing Casting

class typecasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
    }
}


