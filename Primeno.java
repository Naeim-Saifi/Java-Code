public class Primeno {
    static boolean isPrime(int num) {
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        boolean Prime = true;
        int iter = 0;
        for (int i = 5; i * i < num; i += 6) {
            iter++;
            if (num % i == 0 || num % (i + 2) == 0) {
                Prime = false;
                break;
            }
        }
        System.out.println("Iteration"+iter);
        return Prime;
    }

    public static void main(String[] args) {
        int num = 17;
        System.out.println(isPrime(num));

    }
}