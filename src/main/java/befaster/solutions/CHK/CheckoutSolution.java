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

        if(skus==null||skus.isEmpty()){
            return 0;
        }
        else if(!Pattern.matches(regex, skus)){
            return -1;
        }

        List<String> items = Arrays.asList(skus.split(""));
        int sum[] = {0};

        System.out.println(items);

        Map<String, Long> itemByCount = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Long quantA = itemByCount.get("A") == null? 0 : itemByCount.get("A");
        double q1 = (quantA / 5) * 200; // item for multiple of 5
        double q2 = ((quantA % 5) / 3) * 130; // item for multiple of 3
        double q3 = ((quantA % 5) % 3) * 50; // items for remaining
        double totA =  q1 + q2 + q3;

        Long quantB = itemByCount.get("B") == null? 0 : itemByCount.get("B");
        double totB = (quantB/2) * 45 + (quantB % 2) * 30;

        Long quantC = itemByCount.get("C") == null? 0 : itemByCount.get("C");
        double totC = 20 * quantC;

        Long quantD = itemByCount.get("D") == null ? 0 : itemByCount.get("D");
        double totD = 15 * quantD;

        Long quantE = itemByCount.get("E") == null ? 0 : itemByCount.get("E");
        //double totE = (quantE / 2) * 40 + (quantE % 2) * 40 + (quantB / 2) * 30;
        //double totE = quantE == 0? 0 : 40 * quantE - (quantB % 2) * 30;
        double totEB = (quantE / 2) * 40 + (quantE % 2) * 40 + (quantB / 2) * 45 + (quantB % 2) * 30;

        //int count = (int) (totA + totB + totC + totD + totE);
        int count = (int) (totA + totC + totD + totEB);


//        for ( Map.Entry<String, Long> entry : itemByCount.entrySet()){
//                String type = entry.getKey();
//                Long total = entry.getValue();
//                if("A".equals(type)){
//                    double q1 = (total / 5) * 200; // item for multiple of 5
//                    double q2 = ((total % 5) / 3) * 130; // item for multiple of 3
//                    double q3 = ((total % 5) % 3) * 50; // items for remaining
//                    sum[0] += q1 + q2 + q3;
//                }else if("B".equals(type)){
//                    sum[0] += (total/2)*45 + (total % 2)* 30;
//                }else if("C".equals(type)){
//                    sum[0] += 20 * total;
//                }else if("D".equals(type)){
//                    sum[0] += 15 * total;
//                }else if("E".equals(type)){
//                    sum[0] += (total / 2) * 40 + (total % 2) * 40 + (total / 2) * 30;
//                }
//        }
//        return  sum[0];

        return count;

    }
}

