import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int[] original = {6, 7, 8, 9, 10};
        System.out.println("Original array:");
        printArray(original);

        reverseArray(original);

        System.out.println("Reversed array:");
        printArray(original);
    }

    // Function to reverse array using stack
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements to stack
        for (int num : arr) {
            stack.push(num);
        }

        // Pop from stack and overwrite array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    //OUTPUT:
//Original Array: 6 7 8 9 10     
//Reversed Array: 10 9 8 7 6
    // Function to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
