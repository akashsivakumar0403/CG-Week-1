import java.util.ArrayList;
import java.util.List;
public class Cards {
    public static List<String> initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        List<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }
        return deck;
    }
    public static void shuffleDeck(List<String> deck) {
        int n = deck.size();
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck.get(i);
            deck.set(i, deck.get(randomCardNumber));
            deck.set(randomCardNumber, 9temp);
        }
    }
    public static List<List<String>> distributeDeck(List<String> deck, int numCards, int numPlayers) {
        if (numCards % numPlayers != 0) {
            System.out.println("It's not possible to distribute " + numCards + " cards equally to " + numPlayers + " players.");
            return new ArrayList<>();
        }
        List<List<String>> playersCards = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            playersCards.add(new ArrayList<>());
        }

        for (int i = 0; i < numCards; i++) {
            playersCards.get(i % numPlayers).add(deck.get(i));
        }
        return playersCards;
    }
    public static void printPlayersCards(List<List<String>> playersCards) {
        for (int i = 0; i < playersCards.size(); i++) {
            System.out.println("Player " + (i + 1) + " cards: " + playersCards.get(i));
        }
    }
    public static void main(String[] args) {
        List<String> deck = initializeDeck();
        shuffleDeck(deck);
        int numCards = 52;
        int numPlayers = 4;
        List<List<String>> playersCards = distributeDeck(deck, numCards, numPlayers);
        if (!playersCards.isEmpty()) {
            printPlayersCards(playersCards);
        }
    }
}

