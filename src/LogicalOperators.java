public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        System.out.println("Value of a is equal to b and b is greater than c: "+((a==b)&&(b>c)));
        System.out.println("Value of a is less to b and b is greater than c: "+((a<b)&&(b>c)));
        System.out.println("Value of a is equal to b or b is greater than c: "+((a<b)&&(b<c)));
        System.out.println("Value of a is equal to b or b is greater than c: "+((a==b)||(b>c)));
        System.out.println("Value of a is equal to b or b is greater than c: "+((a==b)||(b<c)));
        System.out.println("Value of a is equal to b or b is greater than c: "+((a<b)||(b<c)));
        System.out.println("Value of a is not equal to b: "+(!(a==b)));
    }
}
