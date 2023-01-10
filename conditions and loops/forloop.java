//for loop
//for loop syntax
/*
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
*/
//statement 1 is executed (one time) before the execution of the code block.
//statement 2 defines the condition for executing the code block.
//statement 3 is executed (every time) after the code block has been executed.

class forloop{
    public static void main(String[] args){
        for (int i = 0; i < 5; i++) {//for loop
            System.out.println(i);
        }
    }
}

//for range loop
//for range loop syntax
/*
for(type variableName : arrayName) {
  // code block to be executed
}
*/
//for range loop
class forrangeloop{
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {//for range loop
            System.out.println(i);
        }
    }
}