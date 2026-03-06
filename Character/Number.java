package Character;
import java.util.Scanner;
public class Number {
	public static String sign(int n) {
        if (n > 0)
            return "Positive";
        else if (n < 0)
            return "Negative";
        else
            return "Zero";
    }

    public static String eo(int n) {
        if (n % 2 == 0)
            return "Even";
        else
            return "Odd";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(sign(n));
        System.out.println(eo(n));

        sc.close();
    }
}

