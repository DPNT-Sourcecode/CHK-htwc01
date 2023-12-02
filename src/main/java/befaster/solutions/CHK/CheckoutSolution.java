package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        String regex = "^[A-Z]+$";

        if(skus==null){
            return -1;
        }
        else if(skus.isEmpty() || !Pattern.matches(regex, skus)){
            return 0;
        }

        List<String> items = Arrays.asList(skus.split(""));
        int sum[] = {0};

        System.out.println(items);

        Map<String, Long> itemByCount = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for ( Map.Entry<String, Long> entry : itemByCount.entrySet()){
                String type = entry.getKey();
                Long total = entry.getValue();
                if("A".equals(type)){
                    if (total==3){
                        sum[0]+=130;
                    }else {
                        sum[0]+=50*total;
                    }
                }else if("B".equals(type)){
                    if (total==2){
                        sum[0]+=45;
                    }else {
                        sum[0]+=30*total;
                    }
                }else if("C".equals(type)){
                    sum[0] +=20*total;
                }else if("D".equals(type)){
                    sum[0] +=15*total;
                }
        }

        return  sum[0];

    }
}





