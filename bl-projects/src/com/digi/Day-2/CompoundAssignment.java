public class CompoundAssignment {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 6;
        int d = 4;
        int e = 8;
        a += a;
        b -= a;
        c *= c;
        d /= e;
        e %= e;
        System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + e);
    }
}
