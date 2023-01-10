//break and continue
//break : The break statement can also be used to jump out of a loop.
//continue : The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

//break in for loop
class riyaz{
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}

//continue in for loop
class riyaz{
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}