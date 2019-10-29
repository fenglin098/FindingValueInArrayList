import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intArray = Arrays.asList(24, 30, 31, 24, 32, 33, 34, 24, 35, 36);
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.addAll(intArray);
        System.out.println("Search for a number: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        for (int item : arr1) {
            int searchIndex = Collections.binarySearch(arr1, userInput);
            if (searchIndex>=0) {
                int count = 0;
                count++;
                System.out.println(userInput + " was found " + count + " times.");
            } else {
                System.out.println(userInput + " was not found.");
            }
        }
    }
}
