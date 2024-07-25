public class Increment {
    public static void main(String[] args) {
        int a = 5;
        int i;
        i = ++a + ++a + ++a;
        System.out.println("Pre-increment result (i): " + i);
        a = 5;
        i = a++ + ++a + ++a;
        System.out.println("Post-increment result (i): " + i);
    }
}
