public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int temp;

        temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}