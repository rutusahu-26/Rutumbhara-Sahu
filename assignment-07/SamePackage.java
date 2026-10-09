
package pack1;
public class SamePackage {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println("Public: " + obj.a);
        System.out.println("Protected: " + obj.b);
        System.out.println("Default: " + obj.c);
    }
}
