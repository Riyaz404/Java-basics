//explaining data types

//-----byte-----//
class byte1
{
    public static void main(String args[])
    {
        byte a=10;//byte range is -128 to 127 
        byte b=20;
        byte c=(byte)(a+b);
        System.out.println(c);
    }
}
//-----short-----//
class short1
{
    public static void main(String args[])
    {
        short a=10;//short range is -32768 to 32767
        short b=20;
        short c=(short)(a+b);
        System.out.println(c);
    }
}
//-----int-----//
class int1
{
    public static void main(String args[])
    {
        int a=10;//int range is -2147483648 to 2147483647
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
}
//-----long-----//
class long1
{
    public static void main(String args[])
    {
        long a=10;//long range is -9223372036854775808 to 9223372036854775807
        long b=20;
        long c=a+b;
        System.out.println(c);
    }
}
//-----float-----//
class float1
{
    public static void main(String args[])
    {
        float a=10.5f;//float range is 3.4e−038 to 3.4e+038
        float b=20.5f;
        float c=a+b;
        System.out.println(c);
    }
}

//-----double-----//

class double1
{
    public static void main(String args[])
    {
        double a=10.5;//double range is 1.7e−308 to 1.7e+308
        double b=20.5;
        double c=a+b;
        System.out.println(c);
    }
}

//-----char-----//
class char1
{
    public static void main(String args[])
    {
        char a='a';//char range is 0 to 65535
        char b='b';
        char c=(char)(a+b);
        System.out.println(c);
    }
}

//-----boolean-----//
class boolean1
{
    public static void main(String args[])
    {
        boolean a=true;//boolean range is true or false
        boolean b=false;
        boolean c=a||b;
        System.out.println(c);
    }
}

//-----String is a class not a data type-----//

class string1{

    public static void main(String args[]){

        String a="hello";//String is a class not a data type
        String b="world";
        String c=a+b;
        System.out.println(c);
    }

}