import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //bounded types = you can create the object of a generic class to have data
        // of specific derived types ex.number

        MyGenericClass <Integer,Integer> myInt = new MyGenericClass<>(3,7);
        MyGenericClass <Double,Double> myDouble = new MyGenericClass<>(3.23,1.5);
        MyGenericClass <Character,Character> myChar = new MyGenericClass<>('@','€');
        MyGenericClass <String,Character> myString = new MyGenericClass<>("Hey",'!');

        //HashMap<Integer, String> users = new HashMap<>();
        //ArrayList<String> myFriends = new ArrayList<>();

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}