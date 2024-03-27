public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        // Autoboxing
        Integer a = 10;
        Integer b = 20;
        Integer c = 30;
        Integer sum = a + b + c;
        System.out.println("Sum of a, b, and c is: " + sum);

        // Unboxing
        int d = 10;
        int e = 20;
        int f = 30;
        int difference = d - e - f;
        System.out.println("Difference of d, e, and f is: " + difference);

        // Autoboxing and unboxing
        int g = 100;
        Integer h = 100;
        int i = h.intValue();
        Integer j = Integer.valueOf(g);
        Integer k = 100;
        System.out.println("g == h is: " + (g == h));
        System.out.println("j == k is: " + (j == k));
    }
}