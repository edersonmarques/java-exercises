import java.util.Scanner;
public class PowerMR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write m and r: ");
        double m = input.nextDouble(), r = input.nextDouble();
        System.out.println("mr² = " + Math.pow(m, r));
    }
}
