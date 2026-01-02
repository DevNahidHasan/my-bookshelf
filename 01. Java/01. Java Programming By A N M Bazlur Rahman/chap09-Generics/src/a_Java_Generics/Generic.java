package a_Java_Generics;

public class Generic<T> {

    private T obj;

    //constructor
    public Generic(T obj){
        this.obj = obj;
    }

    //getter method
    public T getObj(){
        return this.obj;
    }

    //method to print type of object of this class
    public void showType(){
        System.out.println("Type of T: "+ obj.getClass().getName());
    }
}
