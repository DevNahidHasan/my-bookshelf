package TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Entity {
    private String name;
    private int age;

    public Entity(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Set<Entity> entities = new TreeSet<>(new Comparator<Entity>() {
            @Override
            public int compare(Entity e1, Entity e2) {
                //Sort by name, then by age if names are the same

                int nameCompariosn = e1.name.compareTo(e2.name);
                if ( nameCompariosn != 0){
                    return nameCompariosn;
                }
                return Integer.compare(e1.age, e2.age);
            }
        });

        entities.add(new Entity("Bob",25));
        entities.add(new Entity("Charlie",30));
        entities.add(new Entity("Alice",30));

        for (Entity entity : entities){
            System.out.println(entity);
        }
    }
}
