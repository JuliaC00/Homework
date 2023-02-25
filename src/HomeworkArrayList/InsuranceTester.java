package HomeworkArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("Toyota"));
        insurances.add(new Pet("Dog"));
        insurances.add(new Health(30));

        for (int i = 0; i < insurances.size(); i++) {
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
            System.out.println("******");
        }
        for (Insurance insurance : insurances) {
            insurance.getQuote();
            insurance.cancelInsurance();
            System.out.println("");
        }
        Iterator<Insurance> iterator = insurances.iterator();
        while (iterator.hasNext()) {
            Insurance i = iterator.next();
            i.getQuote();
            i.cancelInsurance();
            System.out.println("**");
        }
    }}


