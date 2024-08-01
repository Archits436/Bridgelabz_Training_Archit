interface SumCalc {
    int sum(int a, int b);
}

public class SumCalculator {
    public static void main(String[] args) {
        SumCalc sum = (a,b) -> a + b;

        System.out.println(sum.sum(5, 10));
    }
}
