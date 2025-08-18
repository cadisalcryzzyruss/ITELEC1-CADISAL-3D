import java.util.*;

public class Act1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char op = in.next().charAt(0);
        
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        if (op == '+') System.out.println(" = " + (a + b));
        else if (op == '-') System.out.println(" = " + (a - b));
        else if (op == '*') System.out.println(" = " + (a * b));
        else if (op == '/') System.out.println(" = " + (a / b));
        else System.out.println("Invalid operator");

        in.close();
    }
}

