import java.util.Arrays;

/**
 * Created by sharath on 12/07/15.
 */
public class RemoveDup {

    public static void main(String args[]){
        int[] a = {1,2,4,5,3,24,7,4,2,7,4,8,6};
        //int[] a = {4,4,1};

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < i-1; j++) {
                if(a[i] == a[j]){
                    a[i] = 0;
                    a[j] = 0;
                    System.out.println("i = " + i + " j = " + j);
                }
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.print("]");
    }
}
