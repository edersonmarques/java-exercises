public class Mathfuncs {
    public static void main(String[] args) {

        // 1
        System.out.println(Math.sqrt(4)); // 2.0
        System.out.println(Math.sin(2 * Math.PI)); // retorna um valor muito pequeno negativo
        System.out.println(Math.cos(2 * Math.PI)); // 1.0
        System.out.println(Math.pow(2, 2)); // 4.0
        System.out.println(Math.exp(1)); // 2.71...
        System.out.println(Math.log(Math.E)); // 1.0
        System.out.println(Math.max(2, Math.min(3, 4))); // 3
        System.out.println(Math.rint(-2.0)); // -2.0
        System.out.println(Math.ceil(-2.5)); // -2.0
        System.out.println(Math.floor(-2.5)); // -3.0
        System.out.println(Math.round(-2.5f)); // -2
        System.out.println(Math.round(-2.5)); // -2
        System.out.println(Math.rint(2.5)); // 2.0
        System.out.println(Math.ceil(2.5)); // 3.0
        System.out.println(Math.floor(2.5)); // 2.0
        System.out.println(Math.round(2.5f)); // 3
        System.out.println(Math.round(2.5)); // 3
        System.out.println(Math.round(Math.abs(-2.5))); // 3
    
        // 2 - true

        // 3

        double radians_number = Math.toRadians(47);
        System.out.println(radians_number);

        // 4

        double degrees_number = Math.toDegrees(Math.PI / 7);
        System.out.println(degrees_number);

        // 5

        double random_number = 34 + Math.round(Math.random() * (21));
        System.out.println(random_number);

        double random_number2 = (int)(Math.random() * 1000);
        System.out.println(random_number2);

        double random_number3 = 5.5 + Math.random() * 50;
        System.out.println(random_number3);
    }
}