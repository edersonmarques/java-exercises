public class PickACard {

    // Can't use arrays.
    public static void main(String[] args) {
        int randomRank = (int)(Math.random() * 13);
        int randomSuit = (int)(Math.random() * 4);

        String rank = "", suit = "";

        switch (randomRank) {
            case 0:
                rank = "Ace";
                break;
            case 10:
                rank = "Jack";
                break;
            case 11:
                rank = "Queen";
                break;
            case 12:
                rank = "King";
                break;
            default:
                rank = String.valueOf(randomRank + 1);
                break;        
        }

        switch (randomSuit) {
            case 0:
                suit = "Clubs";
                break;
            case 1:
                suit = "Diamonds";
                break;
            case 2:
                suit = "Hearts";
                break;
            case 3:
                suit = "Spades";
                break;        
        }

        System.out.println("You picked " + rank + " of " + suit + ".");
    }
}