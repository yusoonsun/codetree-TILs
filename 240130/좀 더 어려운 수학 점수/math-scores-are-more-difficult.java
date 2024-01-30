import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a==c)
            if(b>d)
            System.out.println("A");
            else
            System.out.println("B");

        else if(a>c)
            System.out.println("A");
        else
            System.out.println("B");
    }
}