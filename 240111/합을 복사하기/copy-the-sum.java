public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int d = a + b + c;
        a = b = c = d;
        System.out.print(a + " " + b + " " + c);
    }
}