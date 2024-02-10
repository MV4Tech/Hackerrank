import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountTheWords {
    public static void main(String[] args) {
        String s = "There once was ship burned at sea and the crew was saved at the last minute from the burning ship";
        String a = "java is a programming language java is widely used";
        System.out.println(countWords(a));
    }

    private static HashMap<String, Integer> countWords(String s) {

        List<String> words = Arrays.stream(s.split(" ")).toList();
        int count = 1;
        int flag =0;
        System.out.println(words.toString());
        HashMap<String,Integer> wordCount = new HashMap<>();
        System.out.println(words.size());
        for(int i =0 ; i< words.size(); i++){

            for(String key : wordCount.keySet()) {
                if (key.equals(words.get(i))) {
                    flag = 1;
                }
            }
            if(flag ==1){
                flag = 0;
                continue;
            }
            for(int j = i+1; j < words.size(); j++){
                if(words.get(i).equals(words.get(j))){
                    count++;
                }
            }

            wordCount.put(words.get(i),count);
            count = 1;
        }
        return wordCount;
    }
}
