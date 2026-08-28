public class RandomColor {
    public static void main(String[] args) {
        int color = (int)(Math.random() * 7 + 1); // between 1 and 7

        switch (color) {
            case 1:
                System.out.println("Violet.");
                break;
            case 2:
                System.out.println("Indigo.");
                break;
            case 3:
                System.out.println("Blue.");
                break;
            case 4:
                System.out.println("Green.");
                break;
            case 5:
                System.out.println("Yellow.");
                break;
            case 6:
                System.out.println("Orange.");
                break;
            case 7:
                System.out.println("Red.");
                break;
        }
    }
}
