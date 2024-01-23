import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Eng = sc.next().charAt(0);

        if (Eng == 'S')
            System.out.println("Superior");
        else if (Eng == 'A')
            System.out.println("Excellent");
        else if (Eng == 'B')
            System.out.println("Good");
        else if (Eng == 'C')
            System.out.println("Usually");
        else if (Eng == 'D')
            System.out.println("Effort");
        else
            System.out.println("Failure");    
    }
}