import java.util.Scanner;

public class CircleMeasurements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int r = sc.nextInt();
        circleMeasurement(r);
    }
    public static void circleMeasurement(int r) {
        float area = (float) (3.14 * r * r);
        float circumference = (float) (2 * 3.14 * r);
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is " + circumference);
    }
}
