public class Multiples {
    public static int main(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {

            boolean divisible3 = i % a == 0;
            boolean divisible5 = i % b == 0;

            if (divisible5 || divisible3) {
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print(main(1000, 3, 5));
    }
}
