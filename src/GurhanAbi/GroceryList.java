package GurhanAbi;

import java.util.Arrays;

public class GroceryList {
    public static void main(String[] args) {
        String[] groceryList = {"apple", "carrot", "orange", "cherry", "strawberry"};
        Arrays.sort(groceryList);
          System.out.println("Index number of apple: " + Arrays.binarySearch(groceryList, "apple"));

          System.out.println("Index number of orange: " + Arrays.binarySearch(groceryList,"orange"));

        }
    }
