package CollectionsHW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InsuranceTester {

        public static void main(String[] args) {
            ArrayList<Insurance> insurances = new ArrayList<>();
            insurances.add(new Car("Car Insurance", "BMW"));
            insurances.add(new Pet("Pet Insurance ", "Cat"));
            insurances.add(new Health("Health Insurance "));

            for (Insurance insurance : insurances) {
                insurance.getQuote();
                insurance.cancelInsurance();
                System.out.println(insurance.insuranceName);
            }

            List<Card> cards = new LinkedList<>();
            cards.add(new Card(0.20, "Credit Card 1"));
            cards.add(new Card(0.16, "Debit Card 2"));
            cards.add(new Card(0.10, "Credit Card 3"));


            Iterator<Card> cardIterator = cards.iterator();
            while (cardIterator.hasNext()) {
                Card card= cardIterator.next();
                System.out.println(card);



            }
        }
    }







