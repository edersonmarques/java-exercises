public class RandomNumberInRange {
    public static void main(String[] args) {
        int random1 = 34 + (int)(Math.random() * 22);
        System.out.println(random1);
        int random2 = (int)(Math.random() * 1000);
        System.out.println(random2);
        double random3 = Math.random() * 55;
    }
}