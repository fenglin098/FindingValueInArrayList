import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count=0;
        List<Integer> intArray = Arrays.asList(24, 30, 31, 24, 32, 33, 34, 24, 35, 36);
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.addAll(intArray);
        System.out.println("Search for a number: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        int searchIndex = Collections.binarySearch(arr1, userInput);
            if (searchIndex>=0) {
                for (int i=0; i<intArray.size();i++) {
                    if (intArray.get(i) == userInput) {
                        count++;
                    } else {
                        break;
                    }
                    System.out.println(userInput + " was found " + count + " times.");
                }
            } else {
                System.out.println(userInput + " was not found.");
            }
        }
}
