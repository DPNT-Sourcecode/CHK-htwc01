package befaster.solutions.CHK;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PriceTable {

    public static final Map<String, Integer> priceTable = new HashMap<>();

    public static final Map<String, SpecialOffer> specialOffers = new HashMap<>();

    static {
        priceTable.put("A", 50);
        priceTable.put("B", 30);
        priceTable.put("C", 20);
        priceTable.put("D", 15);
        priceTable.put("E", 40);
        priceTable.put("F", 10);
        priceTable.put("G", 20);
        priceTable.put("H", 10);

        priceTable.put("I", 35);
        priceTable.put("J", 20);
        priceTable.put("K", 80);
        priceTable.put("L", 90);
        priceTable.put("M", 15);
        priceTable.put("N", 40);
        priceTable.put("O", 10);
        priceTable.put("P", 50);
        priceTable.put("Q", 30);
        priceTable.put("R", 50);
        priceTable.put("S", 30);
        priceTable.put("T", 20);
        priceTable.put("U", 40);
        priceTable.put("V", 50);
        priceTable.put("W", 20);
        priceTable.put("X", 90);
        priceTable.put("Y", 10);
        priceTable.put("Z", 50);

        List<OfferForQuantity> offerForQuantitiesA = Arrays.asList(new OfferForQuantity(3, 130), new OfferForQuantity(5, 200));
        specialOffers.put("A", new SpecialOffer(offerForQuantitiesA, Arrays.asList()));
        specialOffers.put("B", new SpecialOffer(Arrays.asList(new OfferForQuantity(2, 45)), Arrays.asList()));
        specialOffers.put("E", new SpecialOffer(Arrays.asList(), Arrays.asList(new OfferForFreeItem(2, "B"))));
        specialOffers.put("F", new SpecialOffer(Arrays.asList(), Arrays.asList( new OfferForFreeItem(2, "F"))));
        specialOffers.put("H", new SpecialOffer(Arrays.asList(new OfferForQuantity(5, 45), new OfferForQuantity(10, 80)), Arrays.asList()));
        specialOffers.put("K", new SpecialOffer(Arrays.asList(new OfferForQuantity(2, 150)), Arrays.asList()));
        specialOffers.put("N", new SpecialOffer(Arrays.asList(), Arrays.asList(new OfferForFreeItem(3, "M"))));
        specialOffers.put("U", new SpecialOffer(Arrays.asList(), Arrays.asList(new OfferForFreeItem(3, "U"))));
        specialOffers.put("V", new SpecialOffer(Arrays.asList(new OfferForQuantity(2, 90), new OfferForQuantity(3, 130)), Arrays.asList()));

    }
}
