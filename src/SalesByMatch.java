import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SalesByMatch {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5};
        List<Integer> arr = Arrays.asList(4, 5, 5, 5, 6, 6, 4, 1, 4, 4, 3, 6, 6, 3, 6, 1, 4, 5, 5, 5);
        System.out.println(sockMerchant(20, arr));

    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        ar.sort(Comparator.naturalOrder());
        System.out.println(ar);
        int maxNumb = ar.get(n-1);
        //System.out.println(maxNumb);
        int arr[] = new int[maxNumb+1];
        for(int num : ar){
            arr[num]++;
        }

        System.out.println(Arrays.toString(arr));

        int flag = 0;
        for(int i : arr){
            if(i%2==0) {
                flag += i / 2;
            }else{
                int math = i/2;
                if(math%2==0 || math == 1){
                    flag+=math;
                }
            }

        }
        return flag;
    }
}
