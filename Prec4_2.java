public class Prec4_2 {
    static void fun()
    {
        try
        {
            throw new NullPointerException("Practical4.2 (This is a Trying throw method).");
        }
        catch(NullPointerException e)
        {
            System.out.println("And now Catch inside fun().");
            throw e;
        }
    }
    static void fun1() throws IllegalAccessException
    {
        System.out.println("In function1 ().");
        throw new IllegalAccessException("Practical4.2 (this will be Trying throws).");
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println(" Caught in main() using throw.");
        }
        try
        {
            fun1();
        }
        catch(IllegalAccessException e)
        {
            System.out.println(" Catch in main() method usingthrows.");
        }
    }
}
