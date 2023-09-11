/** Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat
 * write a main method that prints how many steps it takes to reach 0 if you start at 100 */
public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int i = 100;
        while (i > 0) {

            boolean IsEven = i % 2 == 0;
            boolean IsOdd = i % 2 != 0;

            if (IsEven) {
                i = (i / 2);
            }
            if (IsOdd) {
                i = (i - 1);
            }
            count ++;
        }
        System.out.println(count);
    }
}
