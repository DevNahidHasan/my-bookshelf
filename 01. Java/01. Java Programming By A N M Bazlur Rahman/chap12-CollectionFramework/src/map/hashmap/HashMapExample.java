package map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> citiesWithPopulation = new HashMap<>();

        citiesWithPopulation.put("Tokyo", 37_410_064);
        citiesWithPopulation.put("Delhi", 27_480_034);
        citiesWithPopulation.put("Dhaka", 47_550_012);

        System.out.println(citiesWithPopulation);

        Integer population = citiesWithPopulation.get("Dhaka");
        System.out.println("Population of Dhaka : "+population);

        Set<String> keys = citiesWithPopulation.keySet();
        System.out.println("keys = " + keys);

        Collection<Integer> values = citiesWithPopulation.values();
        System.out.println("values : " + values);

        System.out.println("dhakaExist : " + citiesWithPopulation.containsKey("Dhaka"));
        System.out.println("value 37410064 Exist : " + citiesWithPopulation.containsValue(37410064));
        System.out.println("total key value pairs : " + citiesWithPopulation.size());
    }
}
