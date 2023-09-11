/** n Multiples.java, write a main method that prints how many multiples of 3 or 5 there are
 * below 1000. Add this file to your project, commit, and push.
 * Check your repo on GitHub to confirm your changes were pushed successfully.*/
public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 3; i < 1000; i++) {

            boolean divisible3 = i % 3 == 0;
            boolean divisible5 = i % 5 == 0;

            if (divisible5 || divisible3) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
