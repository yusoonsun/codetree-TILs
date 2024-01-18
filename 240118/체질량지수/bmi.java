import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = b * 100 * 100 / (a * a);
        System.out.println(c);

        if(c >= 25)
            System.out.println("Obesity");
    }
}