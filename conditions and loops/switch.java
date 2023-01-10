//switch in java
//switch is a conditional statement that allows a variable to be tested for equality against a list of values
//each value is called a case and the variable being switched on is checked for each case
//switch is like a series of if else statements
//switch is used when we have to check the equality of a variable with many different values
//switch is also used when we have many options and we need to perform a different task for each option

//syntax of switch
/*
switch (expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
*/

class switch1{
    public static void main(String[] args){
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}