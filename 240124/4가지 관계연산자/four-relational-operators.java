import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a>=b ? 1 : 0);
        System.out.println(a>b ? 1 : 0);
        System.out.println(b>=a ? 1 : 0);
        System.out.println(b>a ? 1 : 0);
    }
}