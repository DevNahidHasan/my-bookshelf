package a_Java_Generics;

public class TupleDemo {
    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<>("Bazlur", "Rahman");
        tuple.showTypes();

        Tuple<String, Integer> person = new Tuple<>("Nafis", 45);
        person.showTypes();

        Tuple<String, Tuple<Integer,Integer>> tupleInsideTuple = new Tuple<>("String Type Value", new Tuple<>(45,89));
        tupleInsideTuple.showTypes();
    }
}
