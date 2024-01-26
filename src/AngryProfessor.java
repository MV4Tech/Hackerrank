import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AngryProfessor {
    public static void main(String[] args) {

         List<Integer> a = new ArrayList<>();
            a.add(-1);
            a.add(-3);
            a.add(4);
            a.add(2);
            System.out.println(angryProfessor(3,a));
    }

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int counter = 0;

        a.sort(Comparator.naturalOrder());
        System.out.println(a.toString());
        for(int i =0 ; i < a.size(); i++){
            if(a.get(i)<= 0){
                counter++;
            }
        }
        System.out.println(counter);


        return (counter >= k) ? "NO" : "YES";
    }

}
