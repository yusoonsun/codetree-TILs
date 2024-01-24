import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int AM = sc.nextInt();
        int AE = sc.nextInt();
        int BM = sc.nextInt();
        int BE = sc.nextInt();

        if(AM >= BM && AE >= BE)
            System.out.println(1);
        else
            System.out.print(0);
    }
}