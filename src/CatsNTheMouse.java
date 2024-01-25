public class CatsNTheMouse {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println(catAndMouse(x,y,z));

    }

    static String catAndMouse(int x, int y, int z) {
        // with if else
        /*
        int catA = Math.abs((z-x));
        int catB = Math.abs((z-y));
        if(catA == catB){
            return "Mouse C";
        }else if(catA>catB){
            return "Cat B";
        }else if(catA < catB){
            return "Cat A";
        }
        return "";
        */
        // with ternary operator
        String result = Math.abs((z-x)) > Math.abs((z-y))? "Cat B" : "Cat A";
        result = Math.abs((z-x)) == Math.abs((z-y))? "Mouse C" : result;
        return result;


    }
}
