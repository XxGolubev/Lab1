import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        double a = in.nextDouble(), b =in.nextDouble();
        if (a == 0)
            out.printf("x<" + "%.1f" + " or x>" + "%.1f" ,b ,b);
        else if (a > 0)
        {
            if (b == 0)
                out.print("x<0 or x>0");
            else if (b > 0)
                out.printf("x<=0 or x>" + "%.1f",b);
            else
                out.printf("x<" + "%.1f" + " or x>=0",b);
        }
        else
        {
            if (b == 0)
                out.print("no such x");
            else if (b > 0)
                out.printf("0<=x<" + "%.1f",b);
            else
                out.printf("%.1f" + "<x<=0",b);
        }
    }
}