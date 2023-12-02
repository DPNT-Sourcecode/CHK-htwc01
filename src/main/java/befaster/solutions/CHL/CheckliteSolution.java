package befaster.solutions.CHL;

import befaster.runner.SolutionNotImplementedException;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CheckliteSolution {
    public Integer checklite(String skus) {
        String regex = "^[A-Z]+$";
       if(skus == null || skus.isEmpty() ){
           return 0;
       }else if(Pattern.matches(regex, skus)){
           return -1;
       }

        List<String> items = Arrays.asList(skus.split(""));
        Map<String, Long> itemsByCount = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int sum[] = {0};

        for (Map.Entry<String, Long> entry: itemsByCount.entrySet()){
            String type = entry.getKey();
            Long total = entry.getValue();

            if("A".equals(type)){
                sum[0] += (total/3) * 130 + (total % 3) * 50;
            }else if("B".equals(type)){
                sum[0] += (total/2) * 130 + (total % 3) * 50;
            }
            else if("C".equals(type)){

            }else if("D".equals(type)){

            }
        }

        return sum[0];
    }
}
