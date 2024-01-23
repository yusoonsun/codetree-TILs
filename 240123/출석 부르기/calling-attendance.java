import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if (a == 1) {
            System.out.println("John");
        } 
        else if (a == 2) {
            System.out.println("Tom");
        } 
        else if (a == 3) {
            System.out.println("Paul");
        }
        else {
        System.out.println("Vacancy");
        }
    }
}