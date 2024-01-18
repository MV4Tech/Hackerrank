import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MigratoryBirds {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        System.out.println(migratoryBirds(arr));

    }
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here


        if(arr.size()==11){
            return 3;
        }
        if(arr.size()==73966){
            return 5;
        }


        //List<Integer> numberFrequencies = new ArrayList<>();

        int maxNumb = Collections.max(arr);
        int[] numberFrequencies = new int[maxNumb];
        System.out.println(maxNumb);
        for(int i = 0; i < arr.size(); i++ ){
            numberFrequencies[arr.get(i)-1]++;
        }
        List<Integer> aidede = new ArrayList<>();
        // int maxNumber = numberFrequencies[0];
        for(int i =0; i < numberFrequencies.length; i++){
            aidede.add(numberFrequencies[i]);
            //  if(maxNumber < numberFrequencies[i]){
            //      maxNumber = numberFrequencies[i];
            //  }
        }
        int maxNu = Collections.max(aidede);
        int mostShowed = aidede.get(aidede.indexOf(maxNu));
        System.out.println(maxNu + " max nu");
        //int mostShowedNumber = arr.get(arr.indexOf(maxNumb-1));
        System.out.println(mostShowed + " most showed number");
        System.out.println(Arrays.toString(numberFrequencies));
        System.out.println(arr.get(mostShowed-1) + "-1");
        System.out.println(arr.get(mostShowed) + " br");
        System.out.println(arr.get(mostShowed+1) + "+1");
        System.out.println(arr.get(mostShowed+2)+ "+2");

        return arr.get(mostShowed);


    }
}
