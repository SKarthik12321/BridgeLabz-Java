package CoreProgramming.JavaStrings.level3;

import java.util.Scanner;

public class DeckOfCards {

    static String[] createDeck() {

        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;

        for (String s : suits)
            for (String r : ranks)
                deck[idx++] = r + " of " + s;

        return deck;
    }

    static void shuffle(String[] deck) {

        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter players: ");
        int players = sc.nextInt();

        System.out.print("Enter cards per player: ");
        int cards = sc.nextInt();

        String[] deck = createDeck();
        shuffle(deck);

        int idx = 0;

        for (int p = 1; p <= players; p++) {
            System.out.println("Player " + p);
            for (int c = 0; c < cards; c++)
                System.out.println(deck[idx++]);
            System.out.println();
        }

        sc.close();
    }
}