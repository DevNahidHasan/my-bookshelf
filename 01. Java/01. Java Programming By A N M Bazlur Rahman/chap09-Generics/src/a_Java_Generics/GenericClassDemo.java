package a_Java_Generics;

public class GenericClassDemo {
    public static void main(String[] args) {

        //Reference of the class Generic
        Generic<Integer> iObj;

        //object creation with argument 88
        iObj = new Generic<>(88);

        //Printing the type of the obj
        iObj.showType();

        int value = iObj.getObj();

        System.out.println("value = " + value);

        //Checking the same thing for type String
        Generic<String> strObj = new Generic<>("This is a test");
        strObj.showType();

        String strValue = strObj.getObj();

        System.out.println("strValue = " + strValue                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         );
    }
}
