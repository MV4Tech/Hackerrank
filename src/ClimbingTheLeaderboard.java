import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) {

        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(100);
        ranked.add(50);
        ranked.add(40);
        ranked.add(40);
        ranked.add(20);
        ranked.add(10);
        List<Integer> player = new ArrayList<>();
        player.add(5);
        player.add(25);
        player.add(50);
        player.add(120);
        System.out.println(climbingLeaderboard(ranked,player));

    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> listWithoutDuplicates = ranked.stream()
                .distinct()
                .collect(Collectors.toList());

        List<Integer> res = new ArrayList<>();
        Integer currentRank = listWithoutDuplicates.size() + 1;


        for (Integer current : player) {
            while (currentRank > 1 && current >= listWithoutDuplicates.get(currentRank - 2)) {
                currentRank = currentRank -1;
            }
            res.add(currentRank);
        }

        return res;

    }
}
