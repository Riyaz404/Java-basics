//while loop and do while loop

//while loop:-if the condition is true then the loop will execute if the condition is false then the loop will not execute

// while loop syntax
/*
while (condition) {
  // code block to be executed
}

*/

//do-while loop:-if the condition is false then the loop will execute once


//do-while loop syntax
/*
do {
  // code block to be executed
}
while (condition);


*/





import java.util.Scanner;
class whileloop{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        //create a scanner object
        int i = 0;
        while (i < 5) {//while loop
            System.out.println(i);
            i++;
        }
    }
}
//do while loop
class dowhileloop{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        //create a scanner object
        int i = 0;
        do {//do while loop
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}

