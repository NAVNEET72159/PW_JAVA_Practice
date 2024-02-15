import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        double principle = scanner.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.println("Enter the time period: ");
        double time = scanner.nextDouble();
        double simpleIntrest = (principle * rate * time) / 100;
        System.out.println("The simple intrest is: "+simpleIntrest);
    }
}
