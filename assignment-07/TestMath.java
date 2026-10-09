
import mathpack.MathOperations;
public class TestMath {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println("Addition: " + obj.add(10, 5));
        System.out.println("Subtraction: " + obj.subtract(10, 5));
        System.out.println("Multiplication: " + obj.multiply(10, 5));
        System.out.println("Division: " + obj.divide(10, 5));
    }
}
