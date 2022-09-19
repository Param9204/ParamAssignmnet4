public class Prec4_1 {
    public static void main(String[] args) {
        int x=10;
        int y=6;
        int z[] = {5,2,0};
        System.out.println("now! Program Start \n---------------- -----");
        try
        {
            System.out.println("First try...");
            try
            {
                System.out.println("Second try...");
                z[3] = 50;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("First catch...");
                System.out.println("Error Reported By Programme:- "+e);
            }
            System.out.println("First try.....catch ended.....\n");
            z[2] = y/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Second catch...");
            System.out.println("Error Reported By Programmer:"+e);
        }
        System.out.println("---------------------\nnow! Program is Ended");
    }
}