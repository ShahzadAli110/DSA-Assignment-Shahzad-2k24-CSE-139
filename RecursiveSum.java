public class RecursiveSum {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
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
