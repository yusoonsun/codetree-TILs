import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char M = sc.next().charAt(0);

        int b = sc.nextInt();
        char W = sc.next().charAt(0);

        if((a>=19 && M=='M') || (b>=19 && W=='M'))
            System.out.println("1");
        else
            System.out.println("0");
    }
}