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

        Map<String, Long> itemCounts = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int total = 0;
        for (Map.Entry<String, Long> entry : itemCounts.entrySet()) {
            String item = entry.getKey();
            Long count = entry.getValue();
            int price = calculateItemPrice(item, count);
            total += price;
        }

        return total;
//        Long quantA = itemByCount.get("A") == null? 0 : itemByCount.get("A");
//        double q1 = (quantA / 5) * 200; // item for multiple of 5
//        double q2 = ((quantA % 5) / 3) * 130; // item for multiple of 3
//        double q3 = ((quantA % 5) % 3) * 50; // items for remaining
//        double totA =  q1 + q2 + q3;
//
//        Long quantC = itemByCount.get("C") == null? 0 : itemByCount.get("C");
//        double totC = 20 * quantC;
//
//        Long quantD = itemByCount.get("D") == null ? 0 : itemByCount.get("D");
//        double totD = 15 * quantD;
//
//        Long quantE = itemByCount.get("E") == null ? 0 : itemByCount.get("E");
//        double totE = quantE * 40;
//
//        Long quantB = itemByCount.get("B") == null? 0 : itemByCount.get("B");
//
//        // calc free items for B
//        quantB = newQuantB(quantE, quantB);
//        double totB = (quantB/2) * 45 + (quantB % 2) * 30;
//
//
//        Long quantF = itemByCount.get("F") == null ? 0 : itemByCount.get("F");
//        double totF = (quantF / 3) * 2 * 10 + (quantF % 3 ) * 10;
//
//        int count = (int) (totA + totB + totC + totD + totE + totF);
//
//        return count;
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


    public int calculateItemPrice(String item, Long count) {

        int regularPrice = PriceTable.priceTable.get(item);
        int totalPrice[] = {0};

        if (PriceTable.specialOffers.containsKey(item)) {
            SpecialOffer specialOfferoffer = PriceTable.specialOffers.get(item);

            specialOfferoffer.offerForQuantityList.forEach(offer -> {
                totalPrice[0] += (count / offer.getOfferQuant()) * offer.getOfferPrice();
                totalPrice[0] += (count % offer.getOfferQuant()) * regularPrice;
            });


            specialOfferoffer.offerForFreeItemList.forEach(offer -> {
                String freeItem = offer.getFreeItem();
                int freeItemQuant = offer.getFreeItemQuant();

                totalPrice[0] += (count / 3) * freeItemQuant * PriceTable.priceTable.get(freeItem) + (count % 3) * 10;

//                if(totalPrice[0] > 0) {
//                    totalPrice[0] -= freeItemQuant * PriceTable.priceTable.get(freeItem);
//                }else {
//                    totalPrice[0] += freeItemQuant * PriceTable.priceTable.get(freeItem);
//                }
            });

        } else {
            totalPrice[0] += count * regularPrice;
        }

        return totalPrice[0];
    }
}

