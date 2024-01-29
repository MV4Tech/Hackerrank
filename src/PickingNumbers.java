import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(2);
        System.out.println(pickingNumbers(a));

    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<List<Integer>> arr = new ArrayList<>();
        a.sort(Comparator.naturalOrder());
        System.out.println(a.toString());
        List<Integer> a1 = new ArrayList<>();
        for(int i = 0; i < a.size(); i++){
            a1.add(a.get(i));
            for(int j = i+1; j < a.size(); j++){
                if(Math.abs(a.get(i) - a.get(j)) == 0 || Math.abs(a.get(i) - a.get(j))==1 ){
                    a1.add(a.get(j));
                }
            }
            arr.add(new ArrayList<>(a1));
            a1.clear();
        }

        System.out.println(arr.toString());

        int size = arr.get(0).size();

        for(int i =0; i < arr.size(); i++){
            if(size < arr.get(i).size()){
                size = arr.get(i).size();
            }
        }

        return size;
    }

}
