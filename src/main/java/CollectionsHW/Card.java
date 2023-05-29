package CollectionsHW;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Card {

        private double interestRate;
        private String cardType;

        Card(double interestRate, String cardType) {
            this.interestRate = interestRate;
            this.cardType = cardType;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "interestRate=" + interestRate +
                    ", cardType='" + cardType + '\'' +
                    '}';
        }

    }
    class CardTest {
        public static void main(String[] args) {


            List<Card> cards = new LinkedList<>();
            cards.add(new Card(0.20, "Credit Card 1"));
            cards.add(new Card(0.16, "Debit Card 2"));
            cards.add(new Card(0.10, "Credit Card 3"));


            Iterator<Card> cardIterator = cards.iterator();
            while (cardIterator.hasNext()) {
                Card card = cardIterator.next();
                System.out.println(card);


            }
        }
    }