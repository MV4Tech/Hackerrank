import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("aba");
        stringList.add("baba");
        stringList.add("aba");
        stringList.add("xzxb");
        List<String> queries = new ArrayList<>();
        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");
        System.out.println(matchingStrings(stringList,queries));

    }
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here

        int flag = 0;
        List<Integer> arr = new ArrayList<>();

        for(int i=0 ; i < queries.size();i++){
            for(int j = 0; j < stringList.size(); j++){
                if(queries.get(i).equals(stringList.get(j))){
                    flag++;
                }
            }
            arr.add(flag);
            flag = 0;
        }

        return arr;

    }
}
