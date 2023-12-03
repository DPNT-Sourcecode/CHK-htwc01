package befaster.solutions.CHK;

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

        Long quantC = itemByCount.get("C") == null? 0 : itemByCount.get("C");
        double totC = 20 * quantC;

        Long quantD = itemByCount.get("D") == null ? 0 : itemByCount.get("D");
        double totD = 15 * quantD;

        Long quantE = itemByCount.get("E") == null ? 0 : itemByCount.get("E");
        double totE = quantE * 40;

        Long quantB = itemByCount.get("B") == null? 0 : itemByCount.get("B");

        // calc free items for B
        quantB = newQuantB(quantE, quantB);
        double totB = (quantB/2) * 45 + (quantB % 2) * 30;


        Long quantF = itemByCount.get("F") == null ? 0 : itemByCount.get("F");
        quantF = newQuantF(quantF);
        double totF = quantF * 10;

        int count = (int) (totA + totB + totC + totD + totE + totF);

        return count;
    }

    private Long newQuantB(Long quantE, Long quantB) {
        double freeItemB = 0;
        if(quantE % 2 == 0){
            freeItemB = (quantE / 2 );
        }else {
            freeItemB = (quantE - 1) / 2;
        }

        // new quant B
        Long newQuantB = Long.valueOf(0);
        if(quantB > freeItemB){
            newQuantB = quantB - (int)freeItemB;
        }

        return newQuantB;
    }

    private Long newQuantF(Long quantF){
        double freeItem = 0;
        if(quantF % 2 == 0){
            freeItem = (quantF / 2 );
        }else {
            freeItem = (quantF - 1) / 2;
        }

        return quantF - (int)freeItem;
    }
}





