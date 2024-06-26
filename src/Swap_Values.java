public class Swap_Values {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;
        System.out.println("Before swapping: a = " + a + " b = " + b);
        swap(a, b, temp);
        swap(a, b);
    }
    public static void swap(int a, int b, int temp) {
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + " b = " + b);
    }
    public static void swap(int a, int b) {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping: a = " + a + " b = " + b);
    }
}
