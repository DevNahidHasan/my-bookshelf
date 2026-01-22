package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person other) {
        int ageCompariosn = Integer.compare(this.age, other.age);
        if (ageCompariosn != 0){
            return ageCompariosn;
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString(){
        return "Person { name = " + name + ", age = " + age + "}" ;
    }

    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 30));

        for (Person person : people){
            System.out.println(person);
        }
    }
}
