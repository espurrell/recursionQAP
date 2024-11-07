public class SumOfNum {

    public static int sum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int number = 100; // Example
        int result = sum(number);
        System.out.println("The sum of numbers from 1 to " + number + " is: " + result);
    }
}