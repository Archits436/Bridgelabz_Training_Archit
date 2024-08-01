package problem8;

public class Main {
    public static void main(String[] args) {
        String filePath = "abc.txt";
        try {
            ExceptionChaining.readFile(filePath);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            Throwable cause = e.getCause();
            if(cause != null) {
                System.out.println("Cause: " + cause);
            }
        }
    }
}
