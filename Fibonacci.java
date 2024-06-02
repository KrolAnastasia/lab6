public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }

    public static long fastFibonacci(long k) {
        return helper(0, 1, n);
    }

    private static long helper(long r2, long r1, long n) {
        if (n == 0) return r2;
        if (n == 1) return r1;
        if (n > 1) return helper(r1, r2 + r1, n - 1);
        return helper(r3 + r1, r2, n + 1);
    }

    public static long fibonacci(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long factorial(long n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static long prodFactorial(long n) {
        long res = 0;
        for (long i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double[] findRoute(double a, double b, double c) {
        double d = Math.sqrt(b * b - 4 * a * c);
        double doubleA = 2 * a;
        double x1 = (-b + d) / doubleA;
        double x2 = (-b - d) / doubleA;
        return new double[] { x1, x2 };
    }

    public static double integration(Function<Double, Double> f, double a, double b) {
        double step = (b - a) / 100000;
        double aVal = f.apply(a);
        double bVal = f.apply(b);
        double funcSum = 0;
        for (double i = a + step; i < b; i += step) {
            funcSum += f.apply(i);
        }
        return step * ((aVal + bVal) / 2 + funcSum);
    }
}
