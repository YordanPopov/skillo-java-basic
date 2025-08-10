import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] arr = {"Test1", "Test2", "Test1", "Test3", "Test2"};

        for (String el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println("Array without duplicates: " + RemoveDuplicateElements(arr));
    }

    public static HashSet<String> RemoveDuplicateElements(String[] arr) {
        HashSet<String> elements = new HashSet<>();

        for (String element : arr) {
            elements.add(element);
        }

        return elements;
    }
}
