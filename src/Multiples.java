public class Multiples {
    public static int main(int a, int n, int b) {
        int count = 0;
        for (int i = 0; i < n; i++) {

            boolean divisible3 = i % a == 0;
            boolean divisible5 = i % b == 0;

            if (divisible5 || divisible3) {
                count ++;
            }
        }
         return(count);
    }
}
