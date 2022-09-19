public class Prec4_3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        int c[] = {4,5};
        try
        {
            c[b] = c[1]/a;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic-Exception Reported By JAVA.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array-Index-Out-Of- Bounds-Exception Reported By JAVA.");
        }
    }
}