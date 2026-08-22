public class Truncate {
    public static void main(String[] args) {
        double tax = 145.3843497374374;
        System.out.println("tax is $" + (int)tax);
        System.out.println("tax is $" + (int)(tax * 10) / 10.0);
        System.out.println("tax is $" + (int)(tax * 100) / 100.0);
        System.out.println("tax is $" + (int)(tax * 1000) / 1000.0);
        System.out.println("tax is $" + (int)(tax * 100000) / 100000.0);
        System.out.println("tax is $" + tax);
        
        double amount = 5;
        System.out.println(amount / 2);
        System.out.println(5 / 2);
        
    }
}
