import java.util.ArrayList;
import java.util.List;

public class LoopArrayList {
    public static void main(String[] args) {
        List<Object> array = new ArrayList<>();
        array.add(5);
        array.add(6);
        array.add("Fizz");
        array.add("Buzz");
        int i = 0;
        System.out.println("Loop through List with while loop: ");
        while(i!=array.size()){
            System.out.println(array.get(i));
            i++;
        }
        System.out.println("Loop through List with foreach - loop: ");
        for (Object ob: array) {
            System.out.println(ob);
        }

        System.out.println("Loop through List with for - loop: ");

        for(int j=0; j < array.size(); j++){
            System.out.println(array.get(j));
        }

    }

}
