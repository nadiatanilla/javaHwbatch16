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


        }
    }







