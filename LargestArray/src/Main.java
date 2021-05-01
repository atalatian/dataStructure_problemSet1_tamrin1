public class Main {
    static int largestNumber(int[] arr, int counter){
        if (counter + 1 >= arr.length){
            return arr[counter];
        }
        if (arr[counter] > arr[counter + 1]){
            int temp = arr[counter + 1];
            arr[counter + 1] = arr[counter];
            arr[counter] = temp;
        }
        return largestNumber(arr, counter + 1);
    }


    public static void main(String[] args) {
        int[] array = {10, 50, 20, 30, 5, 25, 18, 40, 35, 28, 2};
        System.out.println(largestNumber(array, 0));
    }
}
