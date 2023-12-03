package befaster.solutions.CHK;

import java.util.List;
import java.util.Map;

public class SpecialOffer {

    List<OfferForQuantity> offerForQuantityList;

    List<OfferForFreeItem> offerForFreeItemList;

    public SpecialOffer(List<OfferForQuantity> offerForQuantityList, List<OfferForFreeItem> offerForFreeItemList) {
        this.offerForQuantityList = offerForQuantityList;
        this.offerForFreeItemList = offerForFreeItemList;
    }

//    public int calculateTotalPrice(int itemCount, Map<String, Integer> itemsQaunt){
//
//        offerForQuantityList.forEach(offerForQuantity -> {
//            int offerQuant = offerForQuantity.getOfferQuant();
//            int offerPrice = offerForQuantity.getOfferPrice();
//
//            String item =
//
//            int quantity = itemCount / offerQuant;
//            int remainingItems = itemCount % offerQuant;
//
//            int totalPrice = (quantity * offerPrice) + (remainingItems * PriceTable.priceTable.get())
//        });
//
//
//    }


}
