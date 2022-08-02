package sk.janobono.genericsinjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericMethods {

    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        Collections.addAll(list, array);
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
    }
}
