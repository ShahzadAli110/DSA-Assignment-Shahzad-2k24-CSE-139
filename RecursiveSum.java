public class RecursiveSum {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12, 15};
        int total = sum(numbers, 0);
        System.out.println("Sum of array elements: " + total);
    }

    public static int sum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sum(arr, index + 1);
    }
}

//OUTPUT:
// Array: 3 6 9 12 15 
// Sum of elements: 45
