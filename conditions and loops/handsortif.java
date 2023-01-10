//Short Hand If...Else

//variable = (condition) ? expressionTrue :  expressionFalse;


class handsortif {
    public static void main(String args[]) {
        int a, b, c;//declaring variables
        a = 2;
        b = 3;
        c = a < b ? a : b;//if a is less than b then a is assigned to c else b is assigned to c
        System.out.println("Smallest is " + c);
    }
}