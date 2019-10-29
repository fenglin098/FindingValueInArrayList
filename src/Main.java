import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        ArrayList<Integer> arr1 = new ArrayList<>();
        Collections.addAll(arr1, 24, 30, 31, 24, 32, 33, 34, 24, 35, 36);
        System.out.println("Search for a number: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int searchIndex = Collections.binarySearch(arr1, userInput);
        if (searchIndex >= 0) {
            for (int i = 0; i < arr1.size(); i++) {
                if (arr1.get(i) == userInput) {
                    count++;
                }
            }System.out.println(userInput + " was found " + count + " times.");
        }else {
            System.out.println(userInput + " was not found.");
        }
    }
}
