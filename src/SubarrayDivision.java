import java.util.ArrayList;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {

        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        int d = 3;
        int m = 2;
        System.out.println(birthday(s,d,m));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

        if(m > s.size()){
            return 0;
        }
        int flag = 0;
        if(m == 1){
            for(Integer num : s){
                if(num == d){
                    flag++;
                }
            }
            return flag;
        }

        List<List<Integer>> arr = new ArrayList<>();
        int len = s.size();

        if(m == 2){
            len--;
        }else if(m == 3){
            len -=2;
        }else if(m == 4){
            len -= 3;
        }else if(m == 5){
            len -= 4;
        }else if(m == 6){
            len -= 5;
        }else if(m == 7){
            len -= 6;
        }else if(m == 8){
            len -= 7;
        }else if(m == 9){
            len -= 8;
        }else if(m == 10){
            len -= 9;
        }else if(m == 11){
            len -=10;
        }else if(m == 12){
            len -= 11;
        }

        for(int i =0; i < len; i++){
            arr.add(new ArrayList<>());
        }

        for(int i = 0; i < len; i++){
            for(int j = i; j < m+i; j++){
                //System.out.println( "i:" + s.get(j));
                arr.get(i).add(s.get(j));
            }
        }


        System.out.println(arr.toString());

        System.out.println("len - " + len);
        int sum =0;
        for(int i = 0; i < arr.size(); i++){
            for(int j=0 ; j < m; j++){
                //System.out.println("j: " + j + " i: " + i);
                //System.out.println(arr.get(i).get(j));
                sum+=arr.get(i).get(j);
            }
            System.out.println(sum);
            if(sum == d){
                flag++;
            }
            sum =0;
        }

        return flag;

    }
}


