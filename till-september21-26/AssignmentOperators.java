public class AssignmentOperators {
    public static void main(String[] args) {
        double a = 6.5;
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a);
        int b = 6;
        int c = b++;
        System.out.println(b);
        System.out.println(c);
        b = 6;
        c = ++b;
        System.out.println(b);
        System.out.println(c);
    }    
}
