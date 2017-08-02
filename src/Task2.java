import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by Pavel on 02.08.2017
 */

//Write a generic method that takes an array of objects and a collection, and puts all objects in the array into the collection.

public class Task2 {

    public static void main(String[] args) {

        String[] array = {new String("один"), new String("два"), new String("три")};
        List<String> collection = new ArrayList<>();
        collection.add("четыре");
        collection.add("пять");
        listUnion(array, collection);
    }

    private static void listUnion (String[] array, List<String> collection){

        List<String> res = new ArrayList<>(Arrays.asList(array));
        res.addAll(collection);
        System.out.println(res);
    }
}
