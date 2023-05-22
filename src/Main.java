public class Main {
    // Method to check if a value exists in the array
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    
    // Method to check if a value is even
    static boolean isEven(int[] arr, int value) {
        for (int j : arr) {
            if (j % 2 == 0 && value % 2 == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] list = {22, 7, 3, 22, 2, 4, 10, 4, 7, 1, 33, 2, 9, 1, 10};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (isEven(duplicate, list[i])) { // If the duplicate value in the array is even
                        if (!isFind(duplicate, list[i])) { // Is the duplicate value already added to the array?
                            duplicate[startIndex++] = list[i]; // Add the duplicate value to the array
                        }
                    }
                    break;
                }
            }
        }
        
        for (int value : duplicate) {
            if (value != 0) { // Print only the duplicate values if the remaining elements of the array are 0
                System.out.print(" " + value + " ");
            }
        }
    }
}
