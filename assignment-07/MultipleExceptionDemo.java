
public class MultipleExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            System.out.println(a / b);
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range.");
        }
    }
}
