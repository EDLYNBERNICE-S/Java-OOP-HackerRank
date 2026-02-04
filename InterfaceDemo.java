import java.util.Scanner;

// Interface defining a contract
interface AdvancedArithmetic {
    int divisorSum(int number);
}

// Class implementing the interface
class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int number) {
        int total = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        return total;
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.print("I implemented: ");
        printImplementedInterfaces(calc);

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        System.out.println(calc.divisorSum(value));
        scanner.close();
    }

    // Utility method to print implemented interfaces
    private static void printImplementedInterfaces(Object obj) {
        Class<?>[] interfaces = obj.getClass().getInterfaces();

        for (Class<?> intf : interfaces) {
            System.out.println(intf.getName());
        }
    }
}
