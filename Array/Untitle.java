import java.util.*;

public class Untitle {
    static Scanner sc = new Scanner(System.in);

    public static void array_input(int a) {
        int arr[] = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int array_min(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int array_max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void repeate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println("yes");
            }
        }
    }

    public static void has() {
        HashMap<String, Integer> hm = new HashMap<>();
        int totalSum = 0;
        String input = sc.next();

        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);

        for (int i = 0; i < input.length(); i++) {
            String key = String.valueOf(input.charAt(i));
            if (hm.containsKey(key)) {
                int value = hm.get(key);
                totalSum += value;
            }
        }
        System.out.println(totalSum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 45, 7, 0, 1, 2 };
        // System.out.println("minimum element in array: " + array_min(arr) + "\n
        // maximum element in array: " + array_max(arr));
        // repeate(arr);

        has();
    }
}