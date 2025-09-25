import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();
        System.out.print("Enter speed in km/h: ");
        double speed = sc.nextDouble();
        System.out.print("The required ttime to reach: " + calculateTime(distance, speed) + " hours");
    }

    public static double calculateTime(double x, double v) {
        return x / v;
    }
}
