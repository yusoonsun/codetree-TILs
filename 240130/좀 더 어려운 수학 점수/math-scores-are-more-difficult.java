import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Ma = sc.nextInt();
        int Ea = sc.nextInt();
        int Mb = sc.nextInt();
        int Eb = sc.nextInt();

        if(Ma>Mb || Ma==Mb && Ea>Eb)
            System.out.println("A");
        else
            System.out.println("B");
    }
}