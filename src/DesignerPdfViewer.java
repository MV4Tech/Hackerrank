import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesignerPdfViewer {
    public static void main(String[] args) {

        List<Integer> h = new ArrayList<>();
        h.add(1);
        h.add(3);
        h.add(1);
        h.add(3);
        h.add(1);
        h.add(4);
        h.add(1);
        h.add(3);
        h.add(2);
        h.add(5);
        h.add(5);
        h.add(5);

        String word = "abc";
        System.out.println(designerPdfViewer(h, word));


    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        int height = 0;
        List<Integer> arr = new ArrayList<>();

        for(int j = 0; j < word.length(); j++){
            arr.add(h.get(Math.abs('a' - word.charAt(j))));
        }
        height = Collections.max(arr);
        return height*word.length();

    }

}
