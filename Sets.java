/**
 * Created by sharath on 16/08/15.
 */
public class Sets {

    public static void main(String args[]){
        int sum = 14;
        int[] arr = {3, 5, 6, 9, 14, 8, 2, 12, 7, 7};
        Sets.printSubArrayOfRequiredSum(arr, sum);
    }

    private static void printSubArrayOfRequiredSum(int[] array, int requiredSum) {
        for (int i = 0; i < array.length; i++) {
            String str = "[ ";
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum = sum + array[j];
                str = str + array[j] + ", ";
                if (sum == requiredSum) {
                    System.out.println(" sum : " + sum + " array : " + str
                            + "]");
                    str = "[ ";
                    sum = 0;
                }
            }
        }
    }
}
