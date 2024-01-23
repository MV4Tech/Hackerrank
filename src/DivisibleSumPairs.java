import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DivisibleSumPairs {
    public static void main(String[] args) {

        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2); // Answe should be 5
        int n = 6;
        int k = 3;
        System.out.println(divisibleSumPairs(n,k,ar));

    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here

        ar.sort(Comparator.naturalOrder());
        int flag =0;
        int sum = 0;
        for(int i=0; i < ar.size(); i++){
            for(int j =i+1; j < ar.size(); j++){
                sum = ar.get(i) + ar.get(j);
                if(sum %k ==0){
                    flag++;
                }
                sum =0;
            }
        }
        return flag;

    }


}
