import java.util.Scanner;

public class MyMain {

    public static int rand() {
        return (int) (Math.random()*20) + 1;
    }
    public static int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        int a = rand();
        int b = rand();
        int c = rand();
        System.out.println("The three random numbers are: " + a + ", " + b + ", " + c);
        System.out.println("The largest number is: " + max(a, b, c));
        System.out.println("The smallest number is: " + min(a, b, c));
    }

}


