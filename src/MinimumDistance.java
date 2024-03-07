import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumDistance {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(1);
        a.add(7);
        System.out.println(minimumDistances(a));

    }

    public static int minimumDistances(List<Integer> a) {


        List<Integer> list = new ArrayList<>();
        for(int i =0; i < a.size(); i++){
            for(int j=i+1; j < a.size(); j++){
                if(a.get(i).equals(a.get(j)) ){

                    int indices = j-i;
                    list.add(indices);

                }
            }

        }
        if(list.isEmpty()){
            return -1;
        }

        Collections.sort(list);
        return list.get(0);
    }
}
