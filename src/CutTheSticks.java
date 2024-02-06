import java.util.ArrayList;
import java.util.List;

public class CutTheSticks {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(4);
        a.add(4);
        a.add(2);
        a.add(2);
        a.add(8);
        System.out.println(cutTheSticks(a));

    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> a = new ArrayList<>();
        a.add(arr.size());
        while(!arr.isEmpty()){
            int smallestNumber = arr.get(0);
            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i) < smallestNumber){
                    smallestNumber = arr.get(i);
                }
            }
            System.out.println(smallestNumber);
            System.out.println(arr.toString());
            for(int i =0 ; i < arr.size(); i++){
                arr.set(i, arr.get(i) - smallestNumber);
                if(arr.get(i) == 0){
                    arr.remove(i);
                    i--;
                }

            }
            a.add(arr.size());
        }

        a.remove(a.size()-1);
        return a;
    }
}
