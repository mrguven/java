import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> ranked = Arrays.asList(100,100,50,40,40,20,10);
        List<Integer> player = Arrays.asList(5,25,50,120);
        System.out.println(climbingLeaderboard(ranked, player));
    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        List<Integer> rankFiltered = new ArrayList<>();
        rankFiltered.add(ranked.get(0));
        for (int i = 1; i < ranked.size(); i++) {
            if (!ranked.get(i).equals(ranked.get(i - 1))) {
                rankFiltered.add(ranked.get(i));
            }
        }


        for (int i = 0; i < player.size(); i++) {
            int score = player.get(i);
            // "while (j<rankFiltered.size()){
            //     if ((score>= rankFiltered.get(j))){
            //         if (j==0 || score <= rankFiltered.get(j-1)) {
            //             newRank = j + 1;
            //             j = rankFiltered.size();
            //         }
            //         else {
            //             j =
            //         }

            //     } else {
            //         j = (rankFiltered.size() - j)
            //     }
            //     j++;
            // }"
            int index = binarySearch(rankFiltered, 0, rankFiltered.size()-1, score) + 1;
            result.add(index);
        }
        return result;
    }

    public static int binarySearch(List<Integer> list, int l, int h, int x) {
        if (h >= l) {
            int mid = l + (h - l) / 2;
            int midValue = list.get(mid);
// If the element is present at the middle itself
            if (mid == 0)
                return 0;
            if (midValue >= x) {
                if (x < list.get(mid - 1))
                    return mid;
                else if (x == list.get(mid - 1))
                    return mid - 1;
            }
// If element is smaller than mid, then it can only be present in left subarray
            if (midValue >x)
                return binarySearch(list, mid + 1, h, x);
// Else the element can only be present in right subarray
            return binarySearch(list, l, mid - 1, x);
        }
// We reach here when element is not present in array
        return list.size();
    }

}
