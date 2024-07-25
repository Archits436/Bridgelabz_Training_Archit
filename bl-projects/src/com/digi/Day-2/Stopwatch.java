import java.util.Scanner;

public class Stopwatch {
    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }
    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }
    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to start the stopwatch...");
        scanner.nextLine();
        stopwatch.start();

        System.out.println("Press Enter again to stop the stopwatch...");
        scanner.nextLine();
        stopwatch.stop();

        long elapsedTime = stopwatch.getElapsedTime();
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}
