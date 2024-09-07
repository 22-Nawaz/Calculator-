import java.util.*;
public class cal {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please give value of a");
        int a = sc.nextInt();
        System.out.println("Please give value of b");
        int b = sc.nextInt();
        float sum = a+b ;
        float diff = a-b ;
        float mul = a*b ;
        float div = a/b ;
        float rem = a%b ;
        System.out.println("please select");
        System.out.println("1.addition");
        System.out.println("2.Subration");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        int button = sc.nextInt();
        switch (button) {
            case 1 : System.out.println("a+b="+sum);
            break;
            case 2 : System.out.println("a-b="+diff);
            break;
            case 3 : System.out.println("a*b="+mul);
            break;
            case 4 : System.out.println("a/b="+ div + "Remainder is" + rem);
            break;
            default : System.out.println("ERROR 404");
        }
    }

}