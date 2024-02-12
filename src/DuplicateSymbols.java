import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateSymbols {
    public static void main(String[] args) {

        String str = "Zdr kak si, dnes, be";
        if(duplicateSymbols(str).isEmpty()){
            System.out.println("No repeating symbols");
        }else
        System.out.println(duplicateSymbols(str));

    }

    private static Set<Character> duplicateSymbols(String str) {
        char[] symbols = str.toCharArray();
        Set<Character> result = new HashSet<>();
        for(int i =0 ; i < symbols.length;i++){
            for(int j = i+1; j < symbols.length;j++){
                if(symbols[i] == symbols[j]){
                    result.add(symbols[i]);
                }
            }
        }
        return result;
    }


}
