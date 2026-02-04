// Demonstrates inheritance and use of superclass methods

class Arithmetic {
    public int add(int x, int y) {
        return x + y;
    }
}

class Adder extends Arithmetic {
    // No additional methods, inherits add()
}

public class SuperClassDemo {
    public static void main(String[] args) {
        Adder calculator = new Adder();

        // Display parent class name
        System.out.println("My superclass is: " +
                calculator.getClass().getSuperclass().getSimpleName());

        int first = calculator.add(10, 32);
        int second = calculator.add(10, 3);
        int third = calculator.add(10, 10);

        System.out.println(first + " " + second + " " + third);
    }
}
