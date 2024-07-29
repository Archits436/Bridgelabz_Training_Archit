package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int number = 49;
        double precision = 0.01;
        System.out.println(findSquareRoot(number, precision));
    }

    public static double findSquareRoot(int number, double precision) {
        double left = 0, right = number;
        double mid = 0;

        while ((right - left) > precision) {
            mid = left + (right - left) / 2;
            if (mid * mid == number) {
                return mid;
            } else if (mid * mid < number) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return mid;
    }
}
