import java.util.Arrays;
public class CommonElementsFrom2ARRAYs {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 1, 2, 3, 4, 6,};
        int[] arr3 = new int[10];
        int k=0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[k] = arr1[i];
                    k++;
                    break;
                }
            }
        }
        int[] result = Arrays.copyOf(arr3, k); // This line helps to delete empty 0 elemts in the 3rd array so that that elemts alone will print
        System.out.println(Arrays.toString(result)); //printing arrays in java will result in hascode like [I@6504e937 -- so converting enitre array into string format `````

    }
}
