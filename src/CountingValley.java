import java.util.ArrayList;
import java.util.List;

public class CountingValley {
    public static void main(String[] args) {
//            String s = "UDUUUDUDDD";
//            int n = 10;
//            System.out.println(countingValleys(n,s));

            String s1 = "UDDDUDUU";
            int n1 = 8;
            System.out.println(countingValleys(n1,s1));


    }

    public static int countingValleys(int steps, String path) {

        // Write your code her
        List<Integer> arr = new ArrayList<>();
        int flag = 0;
        int sl = 0;

        System.out.println(steps + " " + path.length());
        for(int i =0 ; i < steps-1; i++){
            if(path.charAt(i) == 'U'){
                sl++;
                arr.add(sl);
            }else if(path.charAt(i) == 'D'){
                sl--;
                arr.add(sl);
            }
        }
        arr.add(0);
        System.out.println(arr.toString());

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == -1){
                flag++;
                while(!(arr.get(i) == 0)){
                    i++;
                }
            }
        }
        return flag;

    }
}
