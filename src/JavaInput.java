import java.util.Scanner;
public class JavaInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Name of the user is: "+ name);
        System.out.println("Age of the user is: "+ age);
        System.out.println("Salary of the user is: "+ salary);
    }
}
