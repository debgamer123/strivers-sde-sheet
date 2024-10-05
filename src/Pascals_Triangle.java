import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listPascalsTriangle = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                List<Integer> recentArray = new ArrayList<Integer>();
                recentArray.add(1);
                listPascalsTriangle.add(recentArray);
            } else {
                List<Integer> recentArray = new ArrayList<Integer>();
                List<Integer> newArray = new ArrayList<Integer>();
                recentArray = listPascalsTriangle.get(i - 1);
                newArray = recentArray.stream().collect(Collectors.toList());
                for (int j = 1; j < newArray.size(); j++) {
                    newArray.set(j, recentArray.get(j) + recentArray.get(j - 1));
                }
                newArray.add(1);
                listPascalsTriangle.add(listPascalsTriangle.size(),newArray);
            }
        }
        return listPascalsTriangle;
    }
}
