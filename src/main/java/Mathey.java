public class Mathey {
    public static int rand() {
        return (int)(Math.random()*20.0) + 1;
    }
    public static int max(double a1, double b1) {
        return Math.max(a, b);
    }
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static int max(int a, int b, int c, int d) {
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
    public static int min(double a1, double b1) {
        return (double) Math.min(a, b);
    }
    public static int min(int a, int b, int c, int d) {
        return Math.min(a, Math.min(b, Math.min(c, d)));
    }
}