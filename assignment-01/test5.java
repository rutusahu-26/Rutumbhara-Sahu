public class test5 {
    public static void main(String[] args) {

        int count = 0;
        int num = 1;

        while (count < 5) {
            if (num % 5 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
