public class Main {


    public static void main(String[] args) {
        System.out.printf("The %d term of the Fibonacci Sequence is: %d", 10, sequence(10));
    }

    /**
     * This method calculates the fibonacci sequence to the nth term then returns the value found.
     * @param n the number of times the sequence will iterate
     * @return the value found at the nth term.
     */
    public static int sequence(int n) {
        if (n <= 1)
            return n;
        return sequence(n - 1) + sequence(n - 2);
    }
}